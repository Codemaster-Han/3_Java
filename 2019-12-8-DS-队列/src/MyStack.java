import java.util.LinkedList;
import java.util.Queue;
//用队列实现栈的操作  ----循环队列
//队列是一个接口
//用LinkedList创建一个队列
public class MyStack {
    Queue<Integer> queue;

    public MyStack(){
        queue=new LinkedList<>();
    }

    //入栈
    public void push(int x) {
        queue.offer(x);
    }

    //出栈
    public int pop() {
        int sz=queue.size();
        while(sz>1){
            queue.offer(queue.poll());
            --sz;
        }
        return queue.poll();
    }

    //栈顶元素
    public int top() {
        int sz=queue.size();
        while(sz>1){
            queue.offer(queue.poll());
            --sz;
        }
        int ret=queue.poll();
        queue.offer(ret);
        return ret;
    }

    //判空
    public boolean empty() {
         return  queue.isEmpty();
    }


    public static void main(String[] args) {
        MyStack queue1=new MyStack();
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        System.out.println(queue1);
        queue1.pop( );
        System.out.println(queue1);
        System.out.println(queue1.top());//3
        System.out.println(queue1.empty());//flase
    }

}
