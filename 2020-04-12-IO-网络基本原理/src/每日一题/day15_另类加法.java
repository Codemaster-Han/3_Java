package 每日一题;
import java.util.*;
/*
        思路：利用位运算，
        对于异或：0^0=0,1^0=1,1^1=0，可以实现数字无进位相加。
        再用与运算0&0=0,1&0=0,1&1=1，将与运算的结果左移1位即可变为进位位。
        一直加到进位位为0结束计算。

        (1左移两位)1<<2 那么就是 0000 0001 变成 0000 0100   相当于右边补2个0
        二进制左移相于乘2,右移相于除2
 */
public class day15_另类加法 {
    public static int addAB(int A, int B) {
        if(A==0){
            return B;
        }
        if(B==0){
            return A;
        }
        int xor,and;//位的(异或^)运算和(求和+)结果一致  位的(与&)运算跟求(进位<<)的结果一致
        while (B!=0){
            xor=A^B;//获取本位
            and=(A&B)<<1;//获取进位
            A=xor;
            B=and;
        }
        return  A;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        System.out.println(addAB(A,B));
    }
}