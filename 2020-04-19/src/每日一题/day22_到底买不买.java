package 每日一题;
import java.util.Scanner;

public class day22_到底买不买 {
    public  static  void toBuyIt(String strSell,String stBuy){
        int stLen=stBuy.length();//小红----5
        int strLen=strSell.length();//摊主---15
        int cnt=0;//包含的珠子个数
        int j=stLen;
        while (j>0){
            String s=stBuy.substring(j-1,j);
            if(strSell.contains(s)){
                cnt++;
            }
            j--;
        }
        if(stLen==cnt){
            int num=strLen-cnt;//----10
            System.out.println("Yes"+" "+num);
        }else {
            int num=stLen-cnt;
            System.out.println("No"+" "+num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str=scanner.nextLine();//卖珠子的摊主
            String st=scanner.nextLine();//小红
            toBuyIt(str,st);
        }
    }
}