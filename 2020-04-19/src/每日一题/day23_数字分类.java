package 每日一题;

import java.util.Scanner;

public class day23_数字分类 {
    public  static void numberDivided(int[] arr) {
        int a1 = 0, a2 = 0, a3 = 0, a5 = 0;
        float a4 =0;
        int k = -1, sum = 0, cnt = 00;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                if (arr[i] % 2 == 0) {
                    a1 += arr[i];
                }
            }
            if (arr[i] % 5 == 1) {
                a2 = a2 + arr[i] * k * (-1);
                k = -k;
            }
            if (arr[i] % 5 == 2) {
                a3++;
            }
            if (arr[i] % 5 == 3) {
                sum += arr[i];
                cnt++;
            }
            if (arr[i] % 5 == 4) {
                if (a5 < arr[i]) {
                    a5 = arr[i];
                }
            }
        }
        a4 = (float) sum / cnt;
        if (a1!=0) {
            System.out.print(a1 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (a2!=0) {
            System.out.print(a2 + " ");
        }else {
            System.out.print("N" + " ");
        }
        if (a3!=0) {
            System.out.print(a3 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (a4!=0) {
            System.out.format("%.1f", a4);//保留到小数点后1位
            System.out.print(" ");
        } else {
            System.out.print("N" + " ");
        }
        if (a5!=0) {
            System.out.print(a5);
        } else {
            System.out.print("N");
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();    //输入  13 1 2 3 4 5 6 7 8 9 10 20 16 18
            }
            numberDivided(arr);//输出  30 11 2 9.7 9
        }
    }
}
