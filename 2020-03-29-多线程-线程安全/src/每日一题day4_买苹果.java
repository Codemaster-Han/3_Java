import java.util.Scanner;

public class 每日一题day4_买苹果 {
    public  static  int  buyApple(int sum){
        if(sum%2!=0){//是奇数
            return -1;
        }
        for(int x=0;x<sum/6;x++){
            for(int y=0;y<sum/6;y++){
                if(sum==8*x+6*y){
                    return  x+y;
                }
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(buyApple(n));

    }
}
