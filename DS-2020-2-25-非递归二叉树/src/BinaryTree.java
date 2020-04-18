import java.util.Stack;

public class BinaryTree {
    //属性
    private TreeNode root=null;

    //前序遍历 ：根 左子树 右子树
    public  void preOrder(TreeNode root){
        if(root==null){  //终止条件
            return;
        }else{  //递归遍历
            System.out.print(root.value);//根
            preOrder(root.left);//左子树
            preOrder(root.right);//右子树
        }
    }
    //  1--非递归 前序遍历
    public  static void preOrderNoR(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        TreeNode curNode=root;
        while(curNode!=null||st.isEmpty()){
            //走到空时结束
            while(curNode!=null){
                //首先访问根
                System.out.print(curNode.value+"");
                //访问根的左子树
                st.push(curNode);
                curNode=curNode.left;
            }
            //获取栈顶元素
            curNode=st.pop();
            //访问栈顶元素的右子树
            curNode=curNode.right;
        }
       System.out.println( );
    }

    //  2--非递归 中序遍历
    //  3--非递归 后序遍历
    //  4--建立二叉树
    public  TreeNode buildTree(){
        TreeNode root=new TreeNode('A');
        TreeNode node2=new TreeNode('B');
        TreeNode node3=new TreeNode('C');
        TreeNode node4=new TreeNode('D');
        TreeNode node5=new TreeNode('E');
        TreeNode node6=new TreeNode('F');
        TreeNode node7=new TreeNode('G');

        root.left=node2;
        root.right=node5;
        node2.left=node3;
        node2.right=node4;
        node5.left=node6;
        node5.right=node7;
        return  root;
    }
    //  5--实例化
    public static void main(String[] args) {
        BinaryTree aTree=new BinaryTree();
        TreeNode root=aTree.buildTree();
        aTree.preOrder(root);
        System.out.println();
        preOrderNoR(root);

    }
}
