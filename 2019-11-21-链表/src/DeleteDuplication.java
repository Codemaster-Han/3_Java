public class DeleteDuplication {
    public static void main(String[] args) {
        Node n6 = new Node(6);
        Node n5 = new Node(3, n6);
        Node n4 = new Node(3, n5);
        Node n3 = new Node(2, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        // 1 2 2 3 3 6
      //  System.out.println(chkPalindrome (n1));
       printList(deleteDuplication(n1));
    }

    //打印链表
    private static void printList(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur);
        }
    }



    //删除有序链表中重复的节点
    //输入 1->2->2->3->3->6      输出 1->6
    public static Node deleteDuplication(Node pHead) {
        if (pHead == null) {
            return pHead;
        }
        Node prev = new Node();
        Node fake = prev;
        prev.next = pHead;
        Node cur = pHead;
        Node next = pHead.next;

        while (next != null) {
            if (cur.val != next.val) {
                prev = prev.next;
                cur = cur.next;
                next = next.next;
            } else {
                while (next != null && cur.val == next.val) {
                    next = next.next;
                }
                // next 可能是 null

                // 删除 [cur, next)
                prev.next = next;

                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }
        }
        return fake.next;
    }

    //链表的回文结构
    //求中间节点
    public static Node getMiddle(Node head){
        Node cur=head;
        int middle=listLength(head)/2;
        for(int i=0;i<middle;i++){
            cur=cur.next;
        }
        return  cur;
    }

    //逆转链表
    public static Node reverseList(Node head) {
        Node nHead = null;  // 新建一个链表，nHead 是头结点
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            // 把 cur 头插到 nHead 所代表的链表上去
            cur.next = nHead;
            nHead = cur;

            cur = next;
        }
        return nHead;
    }

    //求链表长度
    public static  int listLength(Node head){
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt;
    }

    //判断是否回文   上海自来水来自海上
    public static boolean chkPalindrome(Node A) {
        Node middle = getMiddle(A);
        Node rHead = reverseList(middle);
        Node c1 = A;
        Node c2 = rHead;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }


}
