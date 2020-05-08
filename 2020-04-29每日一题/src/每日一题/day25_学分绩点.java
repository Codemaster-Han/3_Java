package 每日一题;

import java.util.Scanner;

public class day25_学分绩点 {
    public  static void search(int n,int[] cridit,int[] score){
        double gg=0.0;//每科绩点
        double GPA=0.0;//绩点之和
        int sum=0;//学分总和
        for(int i=0;i<n;i++){
            if(score[i]>=90&&score[i]<=100){
                gg=4.0;
            }else if(score[i]>=85&&score[i]<=89){
                gg=3.7;
            }else if(score[i]>=82&&score[i]<=84){
                gg=3.3;
            }else if(score[i]>=78&&score[i]<=81){
                gg=3.0;
            }else if(score[i]>=75&&score[i]<=77){
                gg=2.7;
            }else if(score[i]>=72&&score[i]<=74){
                gg=2.3;
            }else if(score[i]>=68&&score[i]<=71){
                gg=2.0;
            }else if(score[i]>=64&&score[i]<=67){
                gg=1.5;
            }else if(score[i]>=60&&score[i]<=63){
                gg=1.0;
            }else if(score[i]<=60){
                gg=0.0;
            }
            GPA+=gg*cridit[i];//每科绩点*每科学分=学科绩点
            sum+=cridit[i];

        }
        GPA=GPA/sum;
        System.out.printf("%.2f",GPA);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int[] criditArr=new int[n];//学分
            int[] scoreArr=new int[n];//每科成绩
            for(int i=0;i<n;i++){
                criditArr[i]=scanner.nextInt();
            }
            for(int j=0;j<n;j++){
                scoreArr[j]=scanner.nextInt();
            }
            search(n,criditArr,scoreArr);
        }
    }
}

/*
输入
5
4 3 4 2 3
91 88 72 69 56

输出
2.52

 */