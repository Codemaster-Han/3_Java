package 每日一题;

import java.util.Scanner;

/**
 * 3的ASCII码是51   51转化为二进制后是0110011（首位为0是题目要求，必须有7个二进制位）
 * 取最高位为奇校验位，校验位为1
 * 若其中1的个数为偶数个，则首位要添加1   变成10110011
 * 若其中1的个数为奇数个，则首位要添加0
 */
public class day30_奇偶校验 {
    public static void found(char[] arrChar){
        for(char c:arrChar){
            String st1=Integer.toBinaryString(c);//3--51---110011
            String st2=String.format("%07d",Integer.parseInt(st1));//0110011  将字符串参数解析为带符号的十进制整数,宽度为7，不够的用0来补
            int cnt=0;
            for(int i=0;i<7;i++){
                if(st2.charAt(i)=='1'){
                    cnt++;
                }
            }
            System.out.println(cnt%2==0?"1"+st2:"0"+st2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String st = scanner.nextLine();
            char[] arrChar = st.toCharArray();
            found(arrChar);
        }
    }
}
/*
输入
3
3a
输出
10110011
10110011
01100001
 */