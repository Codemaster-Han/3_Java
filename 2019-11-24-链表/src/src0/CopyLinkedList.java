public class CopyLinkedList {
    public static void main(String[] args){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        CopyLinkedList w=new CopyLinkedList();//静态调用非静态方法
        printList(w.copy(n1));//1 ->2-> 3-> 4-> 5->null

        RNode m1=new RNode(1);
        RNode m2=new RNode(2);
        RNode m3=new RNode(3);
        RNode m4=new RNode(4);
        m1.next=m2;
        m2.next=m3;
        m3.next=m4;
        m1.random = m2;
        m2.random = m1;
        m3.random = m3;
        printList(copyRandomList(m1));//1 ->2-> 3-> 4->null

    }
    //普通链表复制
    public   Node copy(Node head){
        Node nHead=null;//定义一个新链表的头结点
        Node nLast=null;
        for(Node cur=head;cur!=null;cur=cur.next){
            Node node=new Node(cur.val);

            if(nHead==null){
              nHead=node;
            }else{
                nLast.next=node;
            }
            nLast=node;
        }
        return nHead;
    }

    //复制带随机指针的链表
    //静态 or 普通   看方法中是否需要对象的属性支持
    // 如果需要修改属性，则用普通方法
     public static RNode copyRandomList(RNode head) {
            if (head == null) {
                return null;
            }

            RNode cur;
            cur = head;
            while (cur != null) {
                RNode node = new RNode();
                node.val = cur.val;

                node.next = cur.next;
                cur.next = node;

                cur = node.next;
            }

            cur = head;
            while (cur != null) {
                if (cur.random != null) {
                    cur.next.random = cur.random.next;
                }

                cur = cur.next.next;
            }

            cur = head;
            RNode nHead = head.next;
            while (cur != null) {
                RNode node = cur.next;

                cur.next = node.next;
                if (node.next != null) {
                    node.next = node.next.next;
                }

                cur = cur.next;
            }

            return nHead;
        }


    //打印链表1
    public static  void printList(Node head ){
        for(Node cur=head;cur!=null;cur=cur.next) {
            System.out.println(cur);
        }
    }
    //打印链表2   方法重载
    public static  void printList(RNode head ){
        for(RNode cur=head;cur!=null;cur=cur.next) {
            System.out.println(cur);
        }
    }
}
