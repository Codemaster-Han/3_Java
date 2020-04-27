package 每日一题;
import java.util.Scanner;

//求A和B的最小公倍数：指能被A和B整除的最小正整数；
//=====方法1
 class Main {
    /**
     * 求最小公倍数：公式法
     * 两个数a,b的最小公倍数是a*b/gcd(a,b)
     * 由于两个数的乘积等于这两个数的最大公约数与最小公倍数的积，即（a，b）× [a，b] = a × b
     * 所以，求两个数的最小公倍数，就可以先求出它们的最大公约数，然后用上述公式求出它们的最小公倍数。
     */
    public static int lcm(int m, int n) {
        return (m * n) / gcd(m, n);
    }
    /**
     * 求最大公约数：辗转相除法
     * 1\. a/b，令r为所得余数（0≤r<b） 若r=0，算法结束，a即为答案
     * 2\. 互换：置 a←b，b←r，并返回第一步
     */
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lcm(a, b));
    }
}

//=====方法2
public class day7_求最小公倍数 {

    public static int minNumber(int x,int y){
        int num=0;
        if(x>y){
            if (x / y == y) {
                num=x;
                return  num;
            }else if(x%y==0){
                num=x;
                return num;
            }else if(x%y==(x-y)){
                num=x*y/(x-y);
                return num;
            }
        }else if(y>x){
            if (y / x == x) {
                num=y;
                return  num;
            }else if(y%x==0){
                num=y;
                return num;
            }else if(y%x==(y-x)){
                num=y*x/(y-x);
                return num;
            }
        }else if(x==y){
            num =x;
            return  num;
        }
        for(int i=0;i<x*y;i++){
            if(i%x==0&&i%y==0){
                num=i;
                return num;
            }
        }
        num=x*y;
        return  num;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //测试案例  2 4--4   12 36--36   5 7--35    6 6--6   33 22--66  6 8--24
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(minNumber(A,B));
    }
}

/*
def gcd(a, b):  # 非递归实现求最大公约数
    while(a % b):
        tmp = a % b
        a = b
        b = tmp
    return b
 */
