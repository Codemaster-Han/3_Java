package 每日一题;

import java.util.Scanner;

public class day26_记票统计 {
    public static void  getVoteResult(int n,char[] chName,char[] voteName ){
        int sum=0;
         for(int i=0;i<chName.length;i++){
             int cnt=0;
             for (int j=0;j<voteName.length;j++){
                 if(voteName[j]==chName[i]){
                     cnt++;
                     j++;//中间有空格
                 }
             }
             sum+=cnt;
             System.out.println(chName[i]+" "+":"+" "+cnt);
             i++;//中间有空格
         }
        System.out.println("Invalid"+" "+":"+" "+sum);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//入选人数--4
        scanner.nextLine();//==========================在数字和字符串之间需要多加一个scanner.nextLine()
        String ch=scanner.nextLine();
        char[] chName=ch.toCharArray();//候选人姓名
        int m=scanner.nextInt();//投票人数
        scanner.nextLine();
        String vo=scanner.nextLine();
        char[] voteName=vo.toCharArray();//输入投票
        getVoteResult(n,chName,voteName);
    }
}

/*
输入
4
A B C D
8
A B C D E F G H

输出
A : 1
B : 1
C : 1
D : 1
Invalid : 4
 */
