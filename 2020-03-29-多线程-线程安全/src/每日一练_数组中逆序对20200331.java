import java.util.Arrays;
import java.util.Scanner;

public class 每日一练_数组中逆序对20200331 {
    public  static  void sweap(int x,int y){
        int tmp=0;
        tmp=x;
        x=y;
        y=tmp;
    }
    public static void main(String[] args) {
            int[] arr1={7,5,6,4};
            int cnt=0;
            for(int i=0;i<arr1.length;i++){
                for(int j=i+1;j<arr1.length;j++){
                    if(arr1[i]>arr1[j]){
                        sweap(arr1[i],arr1[j]);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
