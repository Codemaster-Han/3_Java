package 每日一题;

import java.util.Arrays;
import java.util.Scanner;

public class day11_个位数统计 {

    public static void singleDigitStatistics(int n) {
        int[] arr = new int[20];
        int i = 0;
        while (n > 9){
            arr[i] = n % 10;
            n = n / 10;
            i++;
        }
        arr[i]=n;
        for(int j=0;j<=i;j++){
            int cnt=0;
            for(int w=0;w<=i;w++){
                if(arr[j]==arr[w]){
                    cnt++;
                }
            }
            System.out.println(arr[j]+":"+cnt);
        }
    }
//如何加标志位，提醒如果不是第一次遇见的话，就直接跳过？

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            singleDigitStatistics(n);
        }
        /*
        输入：100311
        输出：
        0:2
        1:3
        3:1
        */
    }
}
