import java.sql.SQLOutput;
import  java.util.*;
public class 每日一练_20200401合法括号序列判断 {
    public static boolean chkParenthesis(String A, int n) {
        int i=0;
        int j=A.length()-1;
        int flag=0;
        int cnt=0;
        while(i<=j){
            if(A.charAt(i)=='('||A.charAt(i)==')'||A.charAt(j)=='('||A.charAt(j)==')'){
                if(n%2==1){
                    return  false;
                }
                if(A.charAt(i)=='('&&A.charAt(j)==')'){
                    i++;
                    j--;
                }else if(A.charAt(i)==')'&&A.charAt(j)=='('){
                    i++;
                    j--;
                    cnt+=2;
                    flag++;
                }else if(A.charAt(i)==')'&&A.charAt(j)==')'){
                    return  false;
                }else if(A.charAt(i)=='('&&A.charAt(j)=='('){
                    return  false;
                }
            }else {
                return  false;
            }
        }
        if(cnt==A.length()){  //"))(("
            return  false;
        }
        if(flag==0||flag%2==1){
            return  true;
        }else {
            return  false;
        }
      //     " ))"  或者"(("
    }
    public static void main(String[] args) {
        //一个合法括号，1：只包括括号字符  2：左括号和右括号一一对应
        //"(()())"  6   合法括号
        //"()()a()"  7  不合法括号
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(chkParenthesis(str, str.length()));
        }

    }
}
