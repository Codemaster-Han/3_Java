package 每日一题;

import java.util.Scanner;

public class day37_木棒拼图 {
    public  static void pinPincture(int n,String[] st){
        int sum=0;//目前有多少条木棒
        int ww=0;
        for(int i=0;i<n;i++){
            int k=Integer.parseInt(st[i].substring(0,1));
            if(k==1){
                sum+=k;
                ww+=Integer.parseInt(st[i].substring(2,3));
            }else {
                sum-=k;
                ww-=Integer.parseInt(st[i].substring(2,3));
            }
            if(sum<=2){
                System.out.println("No");
            }else {
                if(k==1&&ww>Integer.parseInt(st[i+1].substring(2,3))){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            st[i]=scanner.nextLine();
        }
        pinPincture(n,st);
    }
}
//第一个数--1代表插入，2代表删除    第二个数——代表要插入的长度
//当只有2个边时，不能构成多边形
//当两边之和<第三边  也不能构成多边形
/*
5
1 1
1 1
1 1
2 1
1 2

输出
No
No
Yes
No
No
 */