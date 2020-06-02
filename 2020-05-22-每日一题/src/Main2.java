
/*
链接：https://www.nowcoder.com/questionTerminal/5a304c109a544aef9b583dce23f5f5db?toCommentId=1474080
        来源：牛客网
        //连续最大和

不需要建立数组啊～
不断累加，只要小于0，清零，重新开始
只需要记录过程中的最大值
(很容易忽略全为负数的情况)
 */
import java.util.Scanner;
public class Main2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE,temp=0;
            for(int i=0;i<n;i++){
                temp+=sc.nextInt();
                if(temp>max)
                    max=temp;
                if(temp<=0)
                    temp=0;
            }
            System.out.println(max);
        }
    }
}