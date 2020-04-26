import java.util.Scanner;

public class 每日一练day5_神奇的口袋 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[j]+arr[k]==40){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
