package 每日一题;

import java.util.Scanner;

public class day36_字母统计 {
    public static void letterCount(String str,String ss){
        for(int i=0;i<str.length();i++){
            int cnt=0;
            String str1=str.substring(i,i+1);
            for(int j=0;j<ss.length();j++){
                if(ss.substring(j,j+1).equals(str1)){
                    cnt++;
                }
            }
            System.out.println(str1+":"+cnt);
        }
    }
    public static void main(String[] args) {
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String ss=scanner.nextLine();//  DFJEIWFNQLEF0395823048+_+JDLSFJDLSJFKK
            letterCount(str,ss);
        }
    }
}
