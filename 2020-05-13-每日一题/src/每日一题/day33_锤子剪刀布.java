package 每日一题;

import java.util.Scanner;

public class day33_锤子剪刀布 {
    public static void judgeGame(int n,String[] st){
        int winCnt1=0;//甲方胜利的次数
        int winCnt2=0;//乙方胜利的次数
        int ping1=0;//甲方平局的次数
        int ping2=0;//乙方平局的次数
        int overCnt1=0;//甲方失败的次数
        int overCnt2=0;//乙方失败的次数
        StringBuilder st1=new StringBuilder();//存放甲方胜出的字母
        StringBuilder st2=new StringBuilder();//存放乙方胜出的字母
        for(int i=0;i<n;i++){
            char[] ch=st[i].toCharArray();
            if(ch[1]=='C'&&ch[3]=='J'||ch[1]=='B'&&ch[3]=='C'||ch[1]=='J'&&ch[3]=='B'){
                //甲方赢
                winCnt1++;
                overCnt2++;
                st1.append(ch[1]);
            }else if(ch[3]=='C'&&ch[1]=='J'||ch[3]=='B'&&ch[1]=='C'||ch[3]=='J'&&ch[1]=='B'){
                //乙方赢
                winCnt2++;
                overCnt1++;
                st2.append(ch[3]);
            }else {
                //甲乙平局
                ping1++;
                ping2++;
            }
        }
        System.out.println(winCnt1+" "+ping1+" "+overCnt1);
        System.out.println(winCnt2+" "+ping2+" "+overCnt2);
        //System.out.println(st1);//CJBJB
        //System.out.println(st2);//BB
        //获胜最多的字母
        maxn(st1);
        System.out.print(" ");
        maxn(st2);

    }
    public static void maxn(StringBuilder st1) {//获胜最多的字母
        int a=0,b=0,c=0;
        if(st1.toString().contains("C")){
            a++;
        }
        if(st1.toString().contains("J")){
            b++;
        }
        if(st1.toString().contains("B")){
            c++;
        }
        if(a>b){
            if(b>=c){
                System.out.print("C");
            }else {
                if(a>c){
                    System.out.print("C");
                }else {
                    System.out.print("B");
                }
            }
        }else if(a<b){
            if(b<=c){
                System.out.print("B");
            }else {
                System.out.print("J");
            }
        }else if(a==b){
            if(a>c){
                System.out.print("C");
            }else {
                System.out.print("B");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//交锋次数
        scanner.nextLine();
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            st[i]=scanner.nextLine();//甲方+“ ”+乙方
        }
        judgeGame(n,st);
    }
}

//C代表“锤子”  J代表“剪刀”  B代表“布”
/**
 测试输入：
 10
 C J
 J B
 C B
 B B
 B C
 C C
 C B
 J B
 B C
 J J

 测试输出：
 第一行  甲方的 胜 平 负的次数
 第二行  乙方的 胜 平 负的次数
 第三行  甲乙胜出次数最多的手势，如果一样多则输出字母小的
 5 3 2
 2 3 5
 B B
 */