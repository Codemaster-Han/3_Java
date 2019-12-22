import java.util.ArrayList;
import java.util.List;

class Node{
    Node left;
    Node right;
    int value;

    Node(int x){
        value=x;
    }
}

public class MyBinaryTree {
    //中序遍历
    public void _inorder(Node root,List<Integer> list){
         if(root==null){
             return  ;
         }else{
             _inorder(root.left,list);//左子树
             list.add(root.value);//根
             _inorder(root.right,list);//右子树
         }
    }
    //中序遍历  -----访问到的节点保存在容器list中
    public  List<Integer>  inorderTraversal(Node root){
        List<Integer> list=new ArrayList<Integer>() ;
        _inorder(root,list);
        return  list;
    }

    //建立一个二叉树---[1 2 3 4 5 6 7]
    public  Node buildTree(){
            Node root =new Node(1);
            Node node2=new Node(2);
            Node node3=new Node(3);
            Node node4=new Node(4);
            Node node5=new Node(5);
            Node node6=new Node(6);
            Node node7=new Node(7);
            root.left=node2;
            root.right=node3;
            node2.left=node4;
            node2.right=node5;
            node3.left=node6;
            node3.right=node7;
            return  root;
    }

    //实例化
    public static void main(String[] args) {
        MyBinaryTree bTree=new MyBinaryTree();
        Node root=bTree.buildTree();
        bTree.inorderTraversal(root);

        JudgeIsSameTree bTree2=new JudgeIsSameTree();
        System.out.println(bTree2.isBlanceTree(root));
        System.out.println(bTree2.isSymmetryTree(root));

        LevelTraverse bTREE3=new LevelTraverse();
        System.out.println(bTREE3.TwoTree(root));

    }

}
