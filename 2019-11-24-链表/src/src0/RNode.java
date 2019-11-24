public class RNode {
    //属性:值 下一个节点  随机值
    int val;
    RNode next;
    RNode random;

    //构造方法
    RNode(){
        ;
    }

    RNode(int val){
        this.val=val;
    }

    @Override
    public String toString() {
        return String.format("RNode[%d]",val);
    }
}
