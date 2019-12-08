import java.util.Stack;

//最小栈  //O（1） 时间复杂度
public class MyMinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public  MyMinStack(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public  void push(int x){
        if(minStack.isEmpty()||x<minStack.peek()){
            minStack.push(x);
        }
        stack.push(x);
    }

    public  void pop(){
        //自动拆箱方法  比较的是两个的内容
        int ret=stack.peek();
        if(ret==minStack.peek()){
            minStack.peek();
        }

        /*
        //用equals 比较的也是内容
        if(stack.peek().equals(minStack.peek())){
            minStack.peek();
        }
        */

        /*
        if(stack.peek()==minStack.peek()){   //包装类 直接写  比较的是引用
            minStack.pop();
        }
        */

        stack.pop();
    }

    public int top() {
         return stack.peek();
    }

    public  int getMin(){
        return  minStack.peek();
    }

    public static void main(String[] args) {
        MyMinStack test=new MyMinStack();
        test.push(2);
        test.push(4);
        test.push(6);
        System.out.println(test.getMin());
        test.pop();
        test.push(1);
        test.push(1);
        System.out.println(test.getMin());

    }

}
