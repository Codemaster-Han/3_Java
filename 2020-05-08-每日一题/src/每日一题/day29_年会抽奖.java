package 每日一题;

import java.util.Scanner;

/**
 * 思路：  首先这是一个排列组合的问题
 * 采用【不放回抽取】---------假如有4个人，则第一个人有4种抽法  第二个人有3中抽法 第三个人有2种抽法  第四个人有1中抽法
 * 分母--------总共抽取方法==4的阶乘
 * 分子-------存在多少种情况每个人拿到的不是自己的名字
 * 因此这里需要用到【错排算法】求分子---采用递归D(n)=(n-1)*(D(n-2)+D(n-1))    特殊的D(1)=0  D(2)=1
 */
public class day29_年会抽奖 {
    public static void draw(int n){
       long c[]=new long[22];
       c[2]=1;
       c[3]=2;
       for(int i=4;i<c.length;i++){
           c[i]=(i-1)*(c[i-1]+c[i-2]);
       }
       long mm=1;
       for(int j=1;j<=n;j++){
           mm*=j;
       }

      {
          double p=0.00;
          p=(double)c[n]/mm;  //（所有组合方式-1）/所有的组合方式
          System.out.printf("%2.2f",p*100);
          System.out.print("%\n");//  --注意这里的输出格式  要加上\n
      }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();// 2<=n<=20
            draw(n);
        }
    }
}
