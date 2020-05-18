package 每日一题;

import java.util.Scanner;

public class day31_说反话 {
    public static void talkIronic(String st){
        int cnt=0;//空格个数
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' '){
                cnt++;
            }
        }
        String[] newSt=st.split(" ");//按照空格进行分割字符串---分割成立5个小字符串
        for(int j=newSt.length-1;j>=0;j--){
            System.out.print(newSt[j]);
            if(cnt>0){
                System.out.print(" ");
                cnt--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();//    Hello World Here I Come
        talkIronic(st);//   Come I Here World Hello
    }

}
