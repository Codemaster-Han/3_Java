package 每日一题;

import java.util.Scanner;

//思路，类似于斐波那些数列数列
public class day21_统计每个月兔子的总数 {
    public  static int getTotalCount(int monthCount){
        if(monthCount==3){
            return  2;
        }else if(monthCount<3){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();//第几个月--9
            System.out.println(getTotalCount(n));//兔子总数--34
        }
    }
}
