package 每日一题;
import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class day22_链式A加B {
        public ListNode plusAB(ListNode a, ListNode b) {
            if(a==null){
                return b;
            }else if(b==null){
                return a;
            }
            ListNode cur=a;
            ListNode recur=cur;
            int aNumber=0;
            int bNumber=0;
            int sum=0;
            int j=1,k=1;
             while (a!=null)   {
                 aNumber=aNumber+a.val*j;
                 j*=10;
                 a=a.next;
             }
            while (b!=null)   {
                bNumber=bNumber+b.val*k;
                k*=10;
                b=b.next;
            }
            sum=aNumber+bNumber;//344
            while (cur!=null){
                int w=0;
                w=sum%10;
                cur.val=w;
                cur=cur.next;
                sum=sum/10;
            }
             return  recur;
        }

        public static void main(String[] args) {
            ListNode Node1=new ListNode(1);//个位
            ListNode Node2=new ListNode(2);//十位
            ListNode Node3=new ListNode(3);//百位
            Node1.next=Node2;
            Node2.next=Node3;

            ListNode Node4=new ListNode(3);//个位
            ListNode Node5=new ListNode(2);//十位
            Node4.next=Node5;

            day22_链式A加B p=new day22_链式A加B();
            p.plusAB(Node1, Node4);//  321+23=344;
        }
}
