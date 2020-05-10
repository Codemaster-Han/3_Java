package 每日一题;
import java.util.Scanner;
public class day27_找x {
    public static void findX(int[] arr,int x){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                flag=1;
                System.out.println(i);;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int x=scanner.nextInt();//要查找的数
        findX(arr,x);//输出x在arr中的下标
    }
}
/*
输入
2
1 3
0

输出
-1
 */