package 每日一题;

import java.util.Scanner;

public class day14_尼科彻斯定理 {
    public  static String GetSequeOddNum(int m){
      String str=new String();
      int k=m*m*m;
      int num=m*(m-1)+1;//第一个数
      System.out.print(num);
      int w=2;
      int tmp=0;
      int i=0;
      while (tmp!=k){
          tmp=tmp+num;
          num=num+w;
          if(i<m-1){//因为第一个数已经输出了，所以这里只用输出m-1次
              System.out.print("+"+num);
              i++;
          }
      }
      return  str;

    }
    public  static String GetSequeOddNum2(int m){
        StringBuilder str=new StringBuilder();
        int k=m*m*m;
        int num=m*(m-1)+1;//第一个数
        str.append(num);
        int w=2;
        int tmp=0;
        int i=0;
        while (tmp!=k){
            tmp=tmp+num;
            num=num+w;
            if(i<m-1){//因为第一个数已经输出了，所以这里只用输出m-1次
                str.append("+");
                str.append(num);
                i++;
            }
        }
        return  str.toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();//6
            //GetSequeOddNum(n);
            //System.out.println("=============");//31+33+35+37+39+41
            System.out.println(GetSequeOddNum2(n));
        }
    }
}
