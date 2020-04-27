package 每日一题;
import java.sql.SQLOutput;
import java.util.Scanner;

public class day6_计算糖果 {

    public  static  void calculationCandy(int[] arr1){
          int A=(arr1[0]+arr1[2])/2;
          int B=arr1[2]-A;
          int C=arr1[3]-B;
          if(A>=0&&B>=0&&C>=0){
              if((B-C)==arr1[1]){
                  System.out.println(A+" "+B+" "+C);
              }
          }else {
              System.out.println("No");
          }
          /*
          if((B-C)==arr1[1]){
              System.out.println(A+" "+B+" "+C);
          }else {
              System.out.println("No");
          }
          */
    }

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int[] arr=new  int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        calculationCandy(arr);
    }
}
