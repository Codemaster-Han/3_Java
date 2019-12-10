import java.util.Arrays;

public class MyStack {

    //顺序表实现 队列
    private  int[] array;
    private  int size;
    public  MyStack(int n){
        array=new int[n];
        size=0;
    }

    public void push(int value){
        //尾插
        //判断是否需要扩容
        if(size==array.length){
            array=Arrays.copyOf(array,2*size);
        }
        array[size++]=value;
    }

    //尾删
    public  void pop(){
        if (size>0){
            --size;
        }
    }

    //栈顶元素
    public  int top(){
        return  array[size-1];
    }

    //判空
    public  boolean empty(){
       return  array.length==0;
    }

    public static void main(String[] args) {
        MyStack st=new MyStack(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.top());

        st.pop();
        st.pop();
        System.out.println(st.top());
        System.out.println(st.empty());

        System.out.println("遍历：");
        while(st.size!=0){
            System.out.print( st.top()+"  ");
            st.pop();
        }

    }
}
