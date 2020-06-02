import java.util.Scanner;

public class day40_句子逆序 {
    public static String reverse(String sentence){
        String[] st=sentence.split(" ");
        StringBuilder ss=new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            ss.append(st[i]);
            if(i>0){
                ss.append(" ");
            }
        }
        return  ss.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(reverse(scanner.nextLine()));
    }
}

/*
输入
I am a boy
输出
boy a am I
 */