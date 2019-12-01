package 接口的使用;

//乙方：执行者  MyLinkedList1            关键字  implements(实现）
public class  MyLinkedList1  implements  MyList{
private  Node head;

    @Override
    public void pushFront(int element) {
        Node node =new Node();
        node.val=element;
        node.next=head;
        head=node;
    }

    @Override
    public void popFront() {
    head=head.next;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void set(int index, int element) {

    }
}
