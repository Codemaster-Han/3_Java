import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class day47_合唱团 {
    public static void maxProductSum(int n,int[] arr,int k,int d) {
       int[] ss=new int[k];
       int maxPs=1;
       Arrays.sort(arr);
       for(int i=0;i<k;i++){
           if(arr[n-1]-arr[n-2]>d){
               n--;
           }else {
               ss[i]=arr[n-1];
           }
           n--;

       }
       for(int e:ss){
           maxPs*=e;
       }
        System.out.println(maxPs);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        int d=scanner.nextInt();
        maxProductSum(n,arr,k,d);

    }
}

/*
输入
4
7 4 7 9
2  2
输出
63
 */