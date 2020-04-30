package 每日一题;
import java.util.Arrays;
import java.util.Scanner;

public class day14_组个最小数 {
    public static  int  groundMin(int[] arr){
        int k=0;//arr的size
        int len=0;//res的size
        int number=0;//返回的最小组合数
        //求出数字个数
        for(int i=0;i<arr.length;i++){
            len+=arr[i];
        }
        //将对应的值存入新的数组res中
       int[] res=new int[len];
        for(int j=0;j<len;j++){
            if(arr[k]!=0&&k<10){
                for(int w=0;w<arr[k];w++){
                    res[j]=k;
                    j++;
                }
            }
            k++;
            j--;//里面多加了一次，所以这里要进行j--
        }
        //求出最小的最和
        Arrays.sort(res);
        for(int r=0;r<len;r++){
            if(res[0]==0){
                res[0]=res[arr[0]];
                res[arr[0]]=0;
            }
            number=number*10+res[r];
        }
        return  number;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[10];//  2 2 0 0 0 3 0 0 1 0  (代表2个0,2个1,3个5,1个8)
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(groundMin(arr));//  10015558
    }
}
