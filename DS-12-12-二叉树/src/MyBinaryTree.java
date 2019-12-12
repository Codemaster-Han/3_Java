//二叉树
class Node{
    char value;
    Node left;
    Node right;
    Node(char value){
        this.value=value;
    }
}

public class MyBinaryTree {
    //属性
    private Node root=null;
    int size=0;
    public  static int leafSize;//静态局部变量---要用类来调

    //前序遍历 ：根 左子树 右子树
    public  void preOrder(Node root){
        if(root==null){  //终止条件
            return;
        }else{  //递归遍历
            System.out.print(root.value);//根
            preOrder(root.left);//左子树
            preOrder(root.right);//右子树
        }
    }


    //中序遍历:左子树 根 右子树
    public  void inOrder(Node root){
        if(root==null){
            return;
        }else{
            inOrder(root.left);
            System.out.print(root.value);
            inOrder(root.right);
        }
    }

    //后序遍历 :左子树 右子树 根
    public  void postOrder(Node root){
        if(root==null){
            return;
        }else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value);
        }
    }

    //建立一个二叉树
    public  Node buildTree(){
        Node root=new Node('A');
        Node node2=new Node('B');
        Node node3=new Node('C');
        Node node4=new Node('D');
        Node node5=new Node('E');
        Node node6=new Node('F');
        Node node7=new Node('G');
        Node node8=new Node('H');

        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        node5.right=node8;
        return  root;
    }

    //求节点个数 ----遍历
    public  void getSize1(Node root){
        if(root!=null){
            getSize1(root.left);
            size++;
            getSize1(root.right);  //左边循环图标 表示递归
        }
    }

    //求节点个数----用子问题的方法
    public int getSize2(Node root) {
        //递归终止条件
        if(root==null){
            return 0;
        }
        //叶子结点
        if(root.right==null&&root.right==null){
            return  1;
        }
        //整棵树节点=当前节点+左右子树节点
        return  getSize2(root.left)+getSize2(root.right)+1;
    }


    //求叶子节点个数----遍历
    public  void getLeafSize1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){//遍历到是叶子的时候再++
            leafSize++;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    //求节点个数----用子问题的思路
    public  int getLeafSize2(Node root){
        if(root==null){
            return  0;
        }
        if(root.right==null&&root.right==null){
            return  1;
        }
        //整棵树的叶子=左右子树叶子节点之和
        return  getLeafSize2(root.left)+getLeafSize2(root.right);
    }

    //获取第k层节点的个数
    public int getKSize1(Node root,int k){
        if(root==null){
            return  0;
        }
        if(k==1){
            return  1;
        }

        return  getKSize1(root.left,k-1)+getKSize1(root.right,k-1);
    }


    public static void main(String[] args) {
        MyBinaryTree bTree=new MyBinaryTree();
        Node root=bTree.buildTree();

        bTree.preOrder(root);//前序遍历
        System.out.println();

        bTree.inOrder(root);//中序遍历
        System.out.println();

        bTree.postOrder(root);//后序遍历
        System.out.println();

        bTree.getSize1(root);
        System.out.println(bTree.size);//获取总节点的个数

        System.out.println(bTree.getSize2(root)); //获取总节点的个数

        bTree.getLeafSize1(root);
        System.out.println(MyBinaryTree.leafSize); //获取叶子节点的个数

        System.out.println(bTree.getLeafSize2(root));    //获取叶子节点的个数

        System.out.println(bTree.getKSize1(root,4));    //获取第k层节点的个数
    }
}

