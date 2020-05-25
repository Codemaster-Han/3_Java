package 每日一题;
import  java.util.*;
public class day38_最近公祖先 {
    public static int getLCA(int a, int b) {
       while (a!=b){
           for(;a>b;a/=2){
               ;
           }
           for(;a<b;b/=2){
               ;
           }
       }
        return  a;
    }

    public static void main(String[] args) {
      int a=2,b=3;
        System.out.println(getLCA(a, b));
    }
}
