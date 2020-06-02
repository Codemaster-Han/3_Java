import java.util.Scanner;

public class day40删除公共字符 {
    public static void deletSs(String st,String ss){
        //正则表达式基本语法 "[ab]"：表示一个字符串有一个"a"或"b"（相当于"a¦b"）；
        String pattern = "[" + ss + "]";//正则表达式
        String result = st.replaceAll(pattern, "");
        System.out.println(result);
        //replaceAll(String regex, String replacement)
        // 参数 regex -- 匹配此字符串的正则表达式。
        //      newChar -- 用来替换每个匹配项的字符串。
        //成功则返回替换的字符串，失败则返回原始字符串。
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        String ss=scanner.nextLine();
        deletSs(st,ss);
    }
}

/*
输入
They are students.
aeiou

输出
Thy r stdnts.
 */