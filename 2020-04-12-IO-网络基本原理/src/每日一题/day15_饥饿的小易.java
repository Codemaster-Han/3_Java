package 每日一题;

import java.util.Scanner;

//计算最小次数
public class day15_饥饿的小易 {
    public static int hungryXiaoYi(int x) {
        int cnt=0;
        int timi=1000000007;
        int vlue=1;
        while (vlue%timi!=0){
            int k=8*x+7;
            int w=4*x+3;
            if(cnt>1000000){
                break;
            }
            if(k==timi||w==timi){
                 vlue=timi;
            }else if((k+w)==timi){
                vlue=timi;
                cnt++;
            }
            x=k;//更新x的值，算出新的K值
            cnt++;
        }
        if(cnt>1000000){
            return  -1;
        }else {
            return  cnt;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int X=scanner.nextInt();//125000000
            if(X>=1&&X<=1000000006){
                System.out.println(hungryXiaoYi(X));
            }
        }
    }
}
