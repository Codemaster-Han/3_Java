package 每日一题;
import java.util.*;

public class day32_2的个数 {
    public static int countNumberOf2s(int n) {
        int cnt=0;
        StringBuilder strb=new StringBuilder();
        for(int i=0;i<=n;i++){
            strb.append(i);
        }
        char[] ch=strb.toString().toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='2'){
                cnt++;
            }
        }
        return  cnt;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//22---2 12 20 21 22     //32--2 12
        while (scanner.hasNext()){
            System.out.println(countNumberOf2s(scanner.nextInt()));//4
        }
    }
}