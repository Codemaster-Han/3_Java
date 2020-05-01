package 每日一题;

import java.util.Scanner;

/**
 * 【解题思路】
 * 用三个栈表示：----1“入栈车队”   2“出栈车队”  3“待出栈车队”
 * 【测试用例】-------------序列号排序问题
 * 输入： -----
 * 3
 * 1 2 3
 *
 * 输出：-----
 * 1 2 3
 * 1 3 2
 * 2 1 3
 * 2 3 1
 * 3 2 1
 */
public class day17_火车进站 {
    public  static void  serialNamber(int[] arr,int n){
        int k=n*(n-1);
        while (k!=0){
            for(int element:arr){
                System.out.print(element+" ");
            }
            System.out.println();
            k--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        serialNamber(arr,n);
    }
}
