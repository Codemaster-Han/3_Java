package 每日一题;
//学会这个题标准答案的思想
import java.util.Scanner;

public class day18_DNA序列 {
    public static void DNA(String st,int n){
        int cnt=0;
        StringBuilder st2=new StringBuilder(n);
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='G'||st.charAt(i)=='C'){
                for(int j=0;j<n;j++){
                    st2.append(st.charAt(i));
                    if(st2.charAt(j)=='G'||st2.charAt(j)=='C'){
                        cnt++;
                    }
                    i++;
                }
                System.out.println(st2.toString());
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();//  AACTGTGCACGACCTGA
        int n=scanner.nextInt();//  5
        DNA(str,n);//  GCACG
    }
}
