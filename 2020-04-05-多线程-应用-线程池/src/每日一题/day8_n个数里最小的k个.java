package 每日一题;

import java.util.Arrays;
import java.util.Scanner;

//3 9 6 8 -10 7 -11 19 30 12 23 5----------------   -11 -10 3 6 7
//输入n+1个整数，最后一个为K值，结果升序输出
public class day8_n个数里最小的k个 {

    public static int[] minK(int[] arr1,int k){
        Arrays.sort(arr1);
        int[] arr2=new int[k];
        int j=0;
        for(int i=0;i<k;i++){
            arr2[j]=arr1[i];
            j++;
        }
        return  arr2;
    }
    public  static  void  printint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        int[] arr=new int[12];
        for(int i=0;i<12;i++){
            arr[i]=sc.nextInt();
            if(i==11){
                k=arr[11];
            }
        }
        arr=Arrays.copyOfRange(arr,0,arr.length-1);
        printint(minK(arr,k));
    }
}
