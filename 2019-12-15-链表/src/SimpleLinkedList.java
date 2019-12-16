class ListNode{
    int val;
    ListNode next;

    ListNode(){ ;
    }

    ListNode(int val){
        this.val=val;
    }
}

public class SimpleLinkedList {

    //简单链表复制----不停的遍历尾插
    public static ListNode copy(ListNode head){
         ListNode newHead=null;
         ListNode newLast=null;
         for(ListNode current=head;current!=null;current=current.next){
             ListNode node=new ListNode(current.val);
             if(newHead==null){
                 newHead=node;
             }else{
                 newLast.next=node;
             }
             newLast=node;
         }
         return  newHead;
    }

    //打印链表
    public  static void printList(ListNode n){
        for(ListNode current=n;current!=null;current=current.next){
            System.out.println(current.val);
        }
    }

    //实例化
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        ListNode test1=copy(n1);
        printList(test1);
    }

}
