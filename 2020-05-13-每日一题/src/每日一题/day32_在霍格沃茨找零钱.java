package 每日一题;

import java.util.Scanner;

public class day32_在霍格沃茨找零钱 {
    public static void findMoney(String[] st){
        int a=17*19,b=19,c=1;
        String[] arr1=st[0].split("\\.");//应付
        String[] arr2=st[1].split("\\.");//实付
        int k=0,w=0;
        //Integer.parseInt(arr1[0]);//将字符串“10” 转换成int型整数10
        k=Integer.parseInt(arr1[0])*a+Integer.parseInt(arr1[1])*b+Integer.parseInt(arr1[2])*c;
        w=Integer.parseInt(arr2[0])*a+Integer.parseInt(arr2[1])*b+Integer.parseInt(arr2[2])*c;
        int tt;
        int ff=w-k;//ff==(x*a+y*b+z*c
        int x=ff/a,y=ff%a/b,z=ff%a%b/c;
        if(ff>0){
            tt=1;
        }else {
            tt=-1;
        }
        System.out.println(tt*x+"."+tt*y+"."+tt*z);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();//输入  10.16.27 14.1.28
        String[] newSt=st.split(" ");
        findMoney(newSt);//输出  3.2.1
    }
}
