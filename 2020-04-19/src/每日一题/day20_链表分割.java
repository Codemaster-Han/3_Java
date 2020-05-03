package 每日一题;
import java.util.*;

//思路：设置两个链表，遍历原链表，一个追加小数链表，一个追加大数链表，最后将小数链表粘粘到大数链表浅表即为结果
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class day20_链表分割 {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode smallList=new ListNode(-1);
        ListNode bigList=new ListNode(-1);
        ListNode cur=pHead;
        ListNode sHead=smallList;
        ListNode bHead=bigList;
        while (cur!=null){
            if(cur.val<x){
                sHead.next=new ListNode(cur.val);
                sHead=sHead.next;
            }else {
                bHead.next=new ListNode(cur.val);
                bHead=bHead.next;
            }
            cur=cur.next;
        }
        cur=smallList;
        while (cur.next!=null&&cur.next.val!=-1){
            cur=cur.next;
        }
        cur.next=bigList.next;
        return  smallList.next;
    }

    public static void main(String[] args) {

    }

}
