import  java.util.*;
public class 每日一练之汽水瓶20200331 {

    public static  int getNumber(int n){
        int tep=0;
        while(n>1){
            if(n==2){
                return  tep+1;
            }else {
                tep+=n/3;
            }
                n=n/3+n%3;//更新剩余空瓶子数量
        }
        return tep;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while ((sc.hasNextLine())){
            int n=sc.nextInt();//3个空瓶子可以兑换一瓶汽水，最终可以兑换5瓶
            System.out.println(getNumber(n));
        }
    }
}
