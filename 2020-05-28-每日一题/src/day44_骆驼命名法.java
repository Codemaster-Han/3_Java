import java.util.Scanner;

public class day44_骆驼命名法 {
    public  static void reName(String st){
        StringBuilder sb=new StringBuilder();
        String[] ss=st.split("_");
        for(int i=0;i<=ss.length-1;i++){
            if(i==0){
                sb.append(ss[i]);
            }else {
                String s=ss[i].substring(0,1);
                String s1=s.toUpperCase();
                ss[i]=ss[i].replace(s,s1);
                sb.append(ss[i]);
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String st=scanner.nextLine();
            reName(st);
        }
    }
}
/*
hello_world
nice_to_meet_you
 */