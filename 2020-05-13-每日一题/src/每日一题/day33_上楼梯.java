package 每日一题;

import java.util.Scanner;

//小孩上楼梯，青蛙跳台阶   小孩一次可以上1阶，2阶，3阶
//此类问题本质还是斐波那些数列------   1 1 2 3 5 8 13 21 34。。。。
//从后往前看，调到最后一个台阶的最后一调只有三种跳法，要么跳1阶，要么跳2阶，要么跳3阶，countWays(n-1)+countWays(n-2)+countWays(n-3);

//往前看，调到第一个countWays（n-1）这一阶，也只有三种跳法，1阶/2阶/3阶
public class day33_上楼梯 {
    public static int countWays(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int k=(countWays(n-1)+countWays(n-2)+countWays(n-3))%1000000007;
        return k;
    }

    //斐波那些数列高级版  ，用空间换时间
    public  static int jumpCnt(int n){
        int[] a=new int[100000];
        a[0]=1; //1个台阶
        a[1]=2;//2个台阶
        a[2]=4;//3个台阶
        for(int i=3;i<n;i++){
           a[i]=a[i-1]%1000000007+a[i-2]%1000000007+a[i-3]%1000000007;
        }
        return a[n-1];
    }

    //牛客标准答案
    public  static int countWays_NowkCoder(int n){
        int[] arr={1,1,2};
        if(n<3){
            return  arr[n];
        }
        int i=3;
        for( ;i<=n;i++){
            int x=0;
            for(int j=0;j<3;j++){
                x=x+arr[(i+j)%3];
                x%=1000000007;
            }
            arr[i%3]=x;
        }
        return arr[(i-1)%3];
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();//n<=100000  台阶数
            System.out.println(countWays(n));
            System.out.println("===================");
            System.out.println(jumpCnt(n));
            System.out.println("===================");
            System.out.println(countWays_NowkCoder(n));
        }
    }
}

/*
测试
1--1
3--4
4--7
 */