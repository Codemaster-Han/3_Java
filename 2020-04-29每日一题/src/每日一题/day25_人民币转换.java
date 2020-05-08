package 每日一题;

import java.util.Scanner;

public class day25_人民币转换 {
    public static void moneyChange(String str){
        char[] ch=str.toCharArray();
        String stChange="#壹贰叁肆伍陆柒捌玖拾佰仟万亿元角分零整";
        System.out.print("人民币");
        int i=0;//小数点的位置
        while (ch[i]!='.'){
            i++;
        }
        char[] chNew=str.substring(0,i).toCharArray();//小数点前的数字
        for(int k=0;k<chNew.length;k++){
            int star=chNew[k]-'0';
            int end=chNew[k]-'0'+1;
            System.out.print(stChange.substring(star,end));
        }
        System.out.print("元");
        //小数点后的位置
        int cnt=0;
        for(int j=i++;j<ch.length;j++){
            if(ch[j]=='0'){
                cnt++;
                if(cnt==(ch.length-i)){
                    System.out.print(stChange.substring(stChange.length()-1));//整
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            moneyChange(str);
        }
    }
}

/*
输入
151121.15
输出
人民币拾伍万壹仟壹佰贰拾壹元壹角伍分
 */
