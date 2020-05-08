package 每日一题;

import java.util.Scanner;

public class day26_数字之和 {
    public static void numberSum(int n){
        int a=0;
        int sum=0;
        int w=n*n;
        int sum2=0;
        if(n>=0&&n<=9){
            sum=n;
        }else {
            while (n>=1){
                a=n%10;
                sum+=a;
                n=n/10;
            }
        }
        System.out.print(sum+" ");//十进制下所有位置之和

        a=0;
        if(w>=0&&w<=9){
            sum2=w;
        }else {
            while (w>=1){
                a=w%10;
                sum2+=a;
                w=w/10;
            }
        }
        System.out.print(sum2);//十进制下所有位置之和

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();//4
            numberSum(n);//4  7(1+6)
        }
    }
}

/*
输入
4
12
97
39999

输出
4 7
3 9
16 22
39 36

 */