/**
链表反转
*/

public class Reversal{
	//建立一个链表
	public static Node buildLinkedListHand() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		// 1 2 3 4 5
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}
	//打印链表
	public static void printLinkedList(Node head){
		Node cur=head; //current指当前节点    head 指的是头结点
		while(cur!=null){
			System.out.println(cur.val);
			cur=cur.next;
		}
	}
	
	//链表反转
	public static Node reversal(Node head){
		Node p1=null;
		Node p2=head;
		
		while(p2!=null){
			Node p3=p2.next;
			p2.next=p1;//相当于头插
			
			p1=p2;
			p2=p3;
		}
		return p1;
	}	
	
	public static void main(String[] args){
		Node head=buildLinkedListHand();
		printLinkedList(head);//12345
		System.out.println("===================");
		printLinkedList(reversal(head));//54321
	}
}