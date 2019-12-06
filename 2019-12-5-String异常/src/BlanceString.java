import java.util.ArrayList;
import java.util.List;

/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量
 *
 * 举例1：
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * */


class Solution {
    //方法1
    public int balancedStringSplit(String s) {
        int num=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                num++;
            }else{
                num--;
            }
            if(num==0){
                res++;
            }
        }
        return res;
    }

    /*
    //方法2  用压栈和出栈的方式
    public int balancedStringSplit2(String s){
        int count=0;
        List<Character> list=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(list.isEmpty()){
                list.add(c);
            }
        }
    }
    */
}

public class BlanceString {
    public static void main(String[] args) {
        Solution ww=new Solution();
        int sum=ww.balancedStringSplit("RLRRLLRLRL");
        System.out.println(sum);
    }
}
