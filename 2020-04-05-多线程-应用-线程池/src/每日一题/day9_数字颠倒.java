package 每日一题;

import java.util.Scanner;

//输入int  123456700   输出字符串  007654321
public class day9_数字颠倒 {
    public  static  int  numberReversal(int n){
        if(n<=9){
            System.out.print(n);
            return  n;
        }
        int k=n%10;
        System.out.print(k);
        return  numberReversal(n/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            numberReversal(num);
        }
    }
}
