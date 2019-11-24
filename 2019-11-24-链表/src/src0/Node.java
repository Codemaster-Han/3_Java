public class Node {
    //属性
    int val;
    Node next;

    //构造方法
    Node(int val, Node next){
        this.val=val;
        this.next=next;
    }

    Node(int val){
        this.val=val;
        this.next=null;
    }

    //复写
    @Override
    public String toString() {
        return String.format("Node[%d]",val);
    }
}
