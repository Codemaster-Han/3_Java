package 每日一题;

import java.util.Scanner;

//将16进制转换成十进制
public class day36_进制转换 {
    public static void hexChangeDec(String st){
      String[] str=st.split("0x");
        int len=str.length;//2
        long decNumber=Long.parseLong(str[1],16);
        System.out.println(decNumber);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String st=scanner.nextLine();//0xA
            hexChangeDec(st);//10
        }
    }
}
