package 每日一题;

import java.util.Scanner;

public class day34_球的半径和体积 {
    public static void road(int x0,int y0,int z0,int x1,int y1,int z1) {
    double PI=Math.PI;
    double r=Math.sqrt(Math.pow((x1-x0),2)+Math.pow((y1-y0),2)+Math.pow((z1-z0),2));
    double v=4.0*PI*r*r*r/3;
    System.out.printf("%.3f",r);
    System.out.printf(" ");
    System.out.printf("%.3f",v);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int x0=scanner.nextInt();
            int y0=scanner.nextInt();
            int z0=scanner.nextInt();
            int x1=scanner.nextInt();
            int y1=scanner.nextInt();
            int z1=scanner.nextInt();
            road(x0,y0,z0,x1,y1,z1);
        }
    }
}
//球的体积V=(4πr^3)/3
//输入  球中心坐标和球上的一点  0 0 0 1 1 1
//输出  球的半径和体积         1.732 21.766