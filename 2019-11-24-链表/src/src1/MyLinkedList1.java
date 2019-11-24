package src1;


//定义一个双向链表类
public class MyLinkedList1 {
    //双向链表属性 --链表头结点 尾节点 链表长度
    private Node head = null;//头结点
    private Node last = null;//尾节点
    private int size = 0;//链表长度


    //普通方法
    //1-头插
    public void pushFront(int val) {
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        head=node;//头结点和node指向同一处，最开始的地方
        if(head.next==null){
           last=head;
        }
        size++;
    }

    //2-头删
    public void popFront(){
        if (head==null){
            throw new RuntimeException("链表为空");
        }

        if(head.next==null){
            head=null;
            last=null;
        }else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    //3-尾插
    public void pushBack(int val){
        Node node=new Node(val);
        if (last==null){
            head=last=node;
        }else{
            last.next=node;
            node.prev=last;
            last=node;
        }
        size++;
    }
    //4-尾删
    public void popBack(){
        if(head==null){
            throw  new RuntimeException("链表为空");
        }
        if(last.prev!=null){
            last.prev.next=null;
            last=last.prev;
        }else{  //只有一个节点
            head=last=null;
        }
        size--;
    }

    //链表重置
    public void reset(){
        head=last=null;
        size=0;
    }

    //链表打印
    @Override
    public String toString() {
        // "1 --> 2 --> null"
        String s="";
        for(Node cur=head;cur!=null;cur=cur.next){
            s +=String.format("%d-->",cur.val);
        }
        s +="null";
        return s;
    }


}
