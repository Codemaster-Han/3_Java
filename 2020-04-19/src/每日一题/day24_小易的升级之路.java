package 每日一题;

import java.util.Scanner;

public class day24_小易的升级之路 {
    public static int rodeNumber(int a,int[] b){
        int c=0;//最大公约数
        for(int i=0;i<b.length;i++){
            if(a<b[i]){
                //先求最大公约数
                int min=a<b[i]?a:b[i];
                for(int j=min;j>=1;j--){
                    if(a%j==0&&b[i]%j==0){
                        c=j;
                        break;
                    }
                }
                //能力值增加c
                a=a+c;
            }else {
                a=a+b[i];
            }
        }
        return  a;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int a=scanner.nextInt();
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=scanner.nextInt();
            }
            System.out.println(rodeNumber(a,b));
        }
    }
}

/*
3 50
50 105 200   -------110

5 20
30 20 15 40 100----------205
 */