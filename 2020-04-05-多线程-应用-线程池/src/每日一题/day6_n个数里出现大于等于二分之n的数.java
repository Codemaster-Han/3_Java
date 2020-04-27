package 每日一题;

import java.util.Scanner;

public class day6_n个数里出现大于等于二分之n的数 {
        public static int searchNumber(int[] arr1){
            int num=arr1.length/2;
            int cnt=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]>=num){
                    cnt++;
                }
            }
            return  cnt;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int size=(str.length()+1)/2;
        int j=0;
        int[] arr=new int[size];//3 9 3 2 5 6 7 3 2 3 3 3
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                arr[j]=str.charAt(i)-'0';
                j++;
            }
        }
        System.out.println(searchNumber(arr));
    }
    }
