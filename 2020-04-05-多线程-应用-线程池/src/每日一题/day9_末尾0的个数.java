package 每日一题;

import java.util.Scanner;

//求n的阶乘的末尾0 的个数
//当n>17 的时候，n的阶乘就是负数，溢出来了
public class day9_末尾0的个数 {
    public  static  int  nFactorial(int n,int cnt){
        if(n==1){
            System.out.println(cnt);
            return  n;
        }
        if(n%5==0){
            cnt++;
        }
        return  n*nFactorial(n-1,cnt);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if(n>=1&&n<=1000){
                int cnt=0;
                nFactorial(n,cnt);
            }
        }
    }
    /*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            if(n>=1&&n<=1000){
                int k=nFactorial(n);//n=10  3628800
                System.out.println(k);
                int cnt=0;
                while(k>9){
                    if(k%10==0){
                        cnt++;
                    }
                    k=k/10;
                }
                System.out.println(cnt);
            }
        }
    }
    */
}
