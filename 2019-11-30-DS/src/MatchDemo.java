import java.util.Stack;

//代码调试   fn+F8 逐语句   fn+F7逐过程（进入函数里面）
public class MatchDemo {
    public static void main(String[] args) {
        System.out.println(match("{[[]]}"));//true
        System.out.println(match("{[[])}"));//false
        System.out.println(match("{([])}"));//true

    }


    //判断括号是否匹配
    //用压栈  出栈的思想
    //当遇到左括号时，进行压栈   当遇到右括号时获取栈顶元素进行出栈  ，并判断出栈的元素是否和右括号匹配
    //最后，判断栈是否为空  若为空，则完全匹配   若不为空，则为false
    public static boolean match(String s) {
        Stack<Character> st = new Stack<>();//定义一个栈  //要用泛型
        char[][] arr = {{'(', ')'}, {'{', '}'}, {'[', ']'}};//定义一个二维数组

        for (int i = 0; i < s.length(); i++) { //遍历s中的所有元素
            int flag = 0;
            char curCh = s.charAt(i);//定义一个当前元素
            for (int j = 0; j < arr.length; ++j) {
                if (curCh == arr[j][0]) {   //左括号
                    st.push(curCh);//入栈
                    flag = 1;//标志位置1，表示是左括号
                    break;//跳出第一个for循环
                }
            }
            if (flag == 0) {
                //判断是否为空
                if (st.isEmpty()) {
                    return false;
                } else {   //不为空，判断栈顶是否为对应的左括号
                    char topCh = st.pop();//出栈
                    //确定栈顶元素是哪一个左括号
                    for (int k = 0; k < arr.length; ++k) {
                        //确定了左括号
                        if (topCh == arr[k][0]) {
                            //判断当前的右括号是否和左括号匹配
                            if (curCh == arr[k][1]) {
                                break;
                            } else {
                                return false;
                            }
                        }
                    }

                }
            }
        }
        //判断栈是否为空
        return st.isEmpty();
    }

}
