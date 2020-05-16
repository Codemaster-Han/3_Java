package 每日一题;

import java.util.Scanner;

public class day30_大整数排序 {
    public static void bigNumberSort(int n,String[] arrString){
        //情况1---按照每个数的位数大小排列---将最大位数的数字排在最前面   从大-》小
        for(int i=0;i<n;i++){
            int max=arrString[i].length();
            for(int j=i;j<n;j++){
                if(max<arrString[j].length()){
                    String tmp=arrString[i];
                    arrString[i]=arrString[j];
                    arrString[j]=tmp;
                }
            }
        }
        //情况2--如果是同位数，怎么比较     3444  4333
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arrString[i].length()==arrString[j].length()){
                    int t1=10,tt1=0;
                    int t2=10,tt2=0;
                    int cnt=0;
                    char[] ch1=arrString[i].toCharArray();
                    while (ch1.length>0&&cnt<ch1.length){
                        int kkk= arrString[i].charAt(cnt)-48;//char型数组里面数字的提取
                        int ppp=arrString[j].charAt(cnt)-48;
                        tt1=tt1*t1+kkk;
                        tt2=tt2*t2+ppp;
                        cnt++;
                    }
                    if(tt1<tt2){
                        String tmp=arrString[i];
                        arrString[i]=arrString[j];
                        arrString[j]=tmp;
                    }

                }
            }
        }
        for(int k=n-1;k>=0;k--){
            System.out.println(arrString[k]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            scanner.nextLine();
            if(n>=1&&n<=100){
                String[] arrString=new String[n];
                for(int i=0;i<n;i++){
                    arrString[i]=scanner.nextLine();
                }
                bigNumberSort(n,arrString);
            }
        }
    }
}

/*
输入
4
11111111111111111111111111111
2222222222222222222222222222222222
40000000
33333333
输出
33333333----8位
40000000---8位
11111111111111111111111111111----20位
2222222222222222222222222222222222----25位
 */
