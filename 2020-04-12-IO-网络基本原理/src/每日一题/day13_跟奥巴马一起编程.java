package 每日一题;

import java.util.Scanner;

public class day13_跟奥巴马一起编程 {

    /*
    public  static  void coden(int n,String w){
        StringBuilder str=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<n;i++){
            str.append(w);
        }
        System.out.println(str);
        for(int j=0;j<2;j++){
            str2.append(w);
        }
        for(int k=0;k<n/2-2;k++){
            System.out.println(str2);
        }
        System.out.println(str);
    }
    */
    public  static  void coden2(int n,String w){
        for(int i=0;i<n;i++){
            System.out.print(w);
        }
        System.out.println();
        for(int k=0;k<n/2-2;k++){
            System.out.print(w);
            int cnt=n*2-4;
            while(cnt>0){
                System.out.print(" ");
                cnt--;
            }
            System.out.println(w);

        }
        for(int j=0;j<n;j++){
            System.out.print(w);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String w=sc.nextLine();
            if(n>=3&&n<=20){
                coden2(n,w);
            }
        }
    }
}
