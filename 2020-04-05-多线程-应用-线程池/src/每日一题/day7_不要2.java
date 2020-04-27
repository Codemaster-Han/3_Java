package 每日一题;

import java.util.Scanner;

public class day7_不要2 {

    public  static int  howManyCakes(int len,int wide){
        int[][] arr=new int[len][wide];
        int d=0;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(i%4==0||i%4==1){
                for(int j=0;j<wide;j++){
                    if(j%4==0||j%4==1){
                        cnt++;
                    }
                }
            }else {
                for(int j=0;j<wide;j++){
                    if(j%4==2||j%4==3){
                        cnt++;
                    }
                }
            }
        }
        return  cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();//长
        int h=sc.nextInt();//宽
        System.out.println(howManyCakes(w,h));
    }
}
