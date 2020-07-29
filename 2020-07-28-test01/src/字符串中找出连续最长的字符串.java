import java.util.Scanner;
import java.util.*;

public class 字符串中找出连续最长的字符串 {
    public static void serchLongest(String str){
     int max=0;
     int cnt=0;
     int right=0;
      for(int i=0;i<str.length();i++) {
          if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
              cnt++;
              if(max<cnt){
                  max=cnt;
                  right=i;
              }
          }else {
             cnt=0;
          }
      }
        System.out.println(str.substring(right-max+1,right+1));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        serchLongest(str);
    }
}

//输入   abcd12345ed125ss123456789
//输出  123456789