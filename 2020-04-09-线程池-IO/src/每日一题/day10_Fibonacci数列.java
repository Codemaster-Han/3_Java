package 每日一题;

import java.util.Scanner;

public class day10_Fibonacci数列 {
    //求第n个斐波那些数列
    public  static  int fibo(int k){
        if(k<2){
            return k;
        }
        int num= fibo(k-1)+fibo(k-2);
        return  num;
    }

    //求需要几步可以最快成为斐波那些数列
    public  static  int  fastaFibo(int n){
        int cnt=0;
        int i=0;
        while (n!=0){
            if(fibo(i)<=n&&n<=fibo(i+1)){
                if((n-fibo(i))>(fibo(i+1)-n)){
                    cnt=fibo(i+1)-n;
                }else {
                    cnt=n-fibo(i);
                }
                n=0;
            }
            i++;
        }
        return  cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(fastaFibo(n));
        }
    }

}
