import java.util.Scanner;

public class day44_单词倒排 {
    public static void resort(String st){
        String[] ss=st.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=ss.length-1;i>=0;i--){
            sb.append(ss[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        resort(st);
    }
}
