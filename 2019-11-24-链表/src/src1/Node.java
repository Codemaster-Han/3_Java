package src1;

public class Node {
    //节点属性 节点所对应的值  节点的前驱节点 节点的下一个节点
    int val;
    Node prev = null;//前驱节点
    Node next = null;//下一个节点

    //构造方法
    Node(int val){
        this.val=val;
    }

}
