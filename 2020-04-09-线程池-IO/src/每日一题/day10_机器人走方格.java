package 每日一题;
import java.util.*;

public class day10_机器人走方格 {

    //对于每一步，只要没有走到边缘（x==1||y==1)就会有两种选择：向下走（x-1），向右走（y-1），
    public  static  int countWays(int x, int y) {
        if(x<=0||y<=0){
            return 0;
        }
        if(x==1||y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            System.out.println(countWays(x, y));
        }
    }

}

