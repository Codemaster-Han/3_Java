package 每日一题;

import java.util.Arrays;
import java.util.Scanner;

/*
    输入：
5
0
fang 90
yang 50
ning 70
hua 70
liu 80

    输出：
            fang 90
            ning 70
            yang 50
 */
public class day19_成绩排序 {
    public  static  void  gradeSort(int n,String[] arr,int k){
        String[] arr2=new String[n];
        for(int i=0;i<n;i++){
            int index1=arr[i].indexOf(" ");
            int index2=arr[i].length();
            arr2[i]=arr[i].substring(index1+1,index2);//存放成绩的数组
        }
        for(int j=0;j<n;j++){
            for(int w=j+1;w<n;w++){
                if(arr2[j].compareTo(arr2[w])<0){  //降序排列
                    String st=arr[j];
                    arr[j]=arr[w];
                    arr[w]=st;
                }
            }
        }
        for(String score:arr){
            System.out.println(score);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        scanner.nextLine();//这里不需要有一个这个  接收掉空格
        String[] grade=new String[n];
        for(int i=0;i<n;i++){
            grade[i]=scanner.nextLine();
        }
        gradeSort(n,grade,k);
    }

}
