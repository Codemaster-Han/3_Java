class Node{
    int val;
    Node next;

   public Node(int val){
        this.val=val;
    }
}

//链表实现 队列     (链表中有 头结点 和尾节点）
//入队 offer    尾插
//出队 poll     头删
public class SyackQueue {
    //属性
    Node firstNode;
    Node lastNode;
    //构造函数
    public  SyackQueue(){
        firstNode=lastNode=null;
    }

    //入队
    public  void offer(int val){
        Node newNode=new Node(val);
        if(firstNode==null){
            firstNode=newNode;
            lastNode=newNode;
        }
        lastNode.next=newNode;
    }

    //出队
    public  void poll(){
        if(firstNode==null){
            return;
        }
        firstNode=firstNode.next;
    }

    public  int peek(){
        if(firstNode==null){
            return -1;
        }
        return  firstNode.val;
    }

    public int getLast(){
        if(firstNode==null){
            return -1;
        }
        return  lastNode.val;
    }


    public  boolean empet(){
        return firstNode==null||lastNode==null;
    }

    public static void main(String[] args) {
        SyackQueue queue=new SyackQueue();
        System.out.println(queue.empet());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.empet());


    }

}
