import java.util.Scanner;

public class day41_连续最大和 {
    public static int maxSum(int n,int[] arr){
        int max=0;
        int tmp=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                max+=arr[i];
                if(arr[i]<0){
                    tmp=max;
                    if(tmp>max){
                        max=tmp;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//3
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();// -1 2 1
        }
        System.out.println(maxSum(n,arr));
    }
}
