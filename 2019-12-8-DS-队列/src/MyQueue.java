//用两个栈 实现 一个队列
import java.util.Stack;

public class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public  MyQueue(){
        st1=new Stack<>();
        st2=new Stack<>();
    }

    //入队
    public void push(int x) {
        st1.push(x);
    }

    //出队
    public int pop() {
         if(st2.isEmpty()){
             while(!st1.isEmpty()){
                 st2.push(st1.pop());
             }
         }
         return st2.pop();
    }

    //队首元素
    public int top() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        int ret=st2.peek();//只看栈顶元素，但是不出栈
        return ret;
    }

    //判空
    public boolean empty() {
           return  !(st1.size()==0)&&(st2.size()==0);
    }

    public static void main(String[] args) {
       MyQueue queue=new MyQueue();
       queue.push(1);
       queue.push(2);
       queue.push(3);
       queue.push(4);//入队 1 2 3 4
        System.out.println(queue.top());//1
        queue.pop();//2 3 4
        queue.pop();//3 4
        System.out.println(queue.top());//3
        System.out.println(queue.empty());//flase
    }
}
