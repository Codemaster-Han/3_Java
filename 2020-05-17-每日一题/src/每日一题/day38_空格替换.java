package 每日一题;
import  java.util.*;
public class day38_空格替换 {
    //方法1
    public static String replaceSpace(String iniString, int length) {
        String[] st=iniString.split(" ");
        int len=st.length;
        String kk="%20";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<len;i++){
            str.append(st[i]);
            if(i<len-1){
                str.append(kk);
            }
        }
        return str.toString();
    }
    //方法2
    public static String replaceSpace2(String iniString, int length) {

        int cnt=0;//字母数
        for(int i=0;i<length;i++){
            String s=iniString.substring(i,i+1);
             if(s.toCharArray()[0]!=' '){
                 cnt++;
             }
        }
        int k=length-cnt;//空格数
        String[] st=iniString.split(" ");
        int len=st.length;
        String ww="%20";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<len;i++){
            str.append(st[i]);
            if(k>0){
                str.append(ww);
                k--;
            }
        }
        return str.toString();
    }
    //方法3
    public static String replaceSpace3(String iniString, int length){
        return  iniString.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String iniString=scanner.nextLine();//"ma ss wwq";//  Hello  world";//"ma ss wwq";
        int length=iniString.length();
        System.out.println(replaceSpace(iniString, length));
        System.out.println("===========");
        System.out.println(replaceSpace2(iniString,length));
        System.out.println("===========");
        System.out.println(replaceSpace3(iniString,length));
    }
}
