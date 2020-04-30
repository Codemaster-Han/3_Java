package 每日一题;

import java.util.Scanner;

public class day16_统计同成绩学生人数 {
    public static int  statisticScore(int[] arr,int value){
        int cnt=0;
        for(int j=0;j<arr.length;j++){
            if(value==arr[j]){
                cnt++;
            }
        }
        return  cnt;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int len=scanner.nextInt();
            int[] arr=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=scanner.nextInt();
            }
            int value=scanner.nextInt();
            System.out.println(statisticScore(arr,value));
        }
    }
}

        /*
        测试用例
        3
        80 60 90
        60
        2
        85 66
        0
        5
        60 75 90 55 75
        75
        0
        */

