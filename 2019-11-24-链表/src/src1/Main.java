package src1;

public class Main {
    public static void main(String[] args) {
        MyLinkedList1 list = new MyLinkedList1();
        list.pushFront(1);//头插
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        System.out.println(list);//4 3 2 1
        list.reset();//重置链表 null
        list.pushBack(1);//尾插
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        System.out.println(list);//1 2 3 4
        list.popFront();//头删
        list.popFront();
        list.popFront();
        System.out.println(list);//4
        list.popFront();
        System.out.println(list);//null
        list.pushBack(1);//尾插
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        System.out.println(list);//1 2 3 4
        list.popBack();//尾删
        list.popBack();
        list.popBack();
        System.out.println(list);// 1
        list.popBack();
        System.out.println(list);//null
        list.popBack();//异常 链表为空
    }
}
