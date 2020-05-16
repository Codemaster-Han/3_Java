package 每日一题;

import java.util.Scanner;

public class day29_数字和为sum的方法 {
    public static int countSum(int n,int sum,int[] arr){
        int cnt=0;
        for(int i=0;i<n;i++){
            int ww=arr[i];
            for(int j=i+1;j<n;j++){
                int k=arr[i]+arr[j];
                if(k==sum||ww==sum){
                    cnt++;
                }
                ww+=arr[j];
                if(ww>sum){
                    ww-=arr[j];
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();//5
            int sum=scanner.nextInt();//15
            int[] arr=new int[n];// 5 5 10 2 3
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            System.out.println(countSum(n,sum,arr));//4

        }
    }
}

/*
输入
5 15 5 5 10 2 3
输出
4
 */