package 每日一题;

import java.util.Scanner;

public class day34_BrokenKeyboard {
    public static void findWorn(String st1,String st2){
        String ss1=st1.toUpperCase();
        String ss2=st2.toUpperCase();
        StringBuilder stb=new StringBuilder();
        char[] ch1=st1.toCharArray();
        for(int i=0;i<ch1.length;i++){
            String w=ss1.substring(i,i+1);
            if(!ss2.contains(w)){
                if(!stb.toString().contains(w)){
                    stb.append(w);
                }
            }
        }
        System.out.println(stb.toString());
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st1=scanner.nextLine();
        String st2=scanner.nextLine();
        findWorn(st1,st2);
    }
}

/*
输入
7_This_is_a_test
_hs_s_a_es

输出
7TI
 */