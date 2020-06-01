import java.util.Scanner;

public class one_Fibonacci {
    //计算第n个斐波那些数列的值
    public  static int  fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return  fibo(n-1)+fibo(n-2);

    }
    public static int countNumber(int m){
        int cnt=0;
        for(int i=0;i<m;i++){
            int start=fibo(i);//m的左边
            int end=fibo(i+1);//m的右边
            if(m<end&&m>start){
                if((end-m)>=(m-start)){
                    cnt=m-start;
                    break;
                }else {
                    cnt=end-m;
                    break;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();//当前数字N=15
        System.out.println(countNumber(m));//2
    }
}
