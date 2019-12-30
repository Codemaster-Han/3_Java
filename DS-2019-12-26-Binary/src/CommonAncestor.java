import java.util.Stack;
/**
 * 3. 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先 =====OJ链接
 * 找一个二叉树中指定两个节点p,q的公共祖先
 * 方法1-->前序遍历，看寻找的这个结点是不是在根的两边
 * 方法2-->搜索路径，进行路径比对（找第一个相同的节点）
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class CommonAncestor {
    //========================================================
    //前序遍历--找节点//每次查找遍历都会传进一个新的根
    public  boolean find(TreeNode root, TreeNode node){
        if(root == null)
            return false;
        if(root == node)
            return true;
        if(find(root.left,node))
            return true;
        return find(root.right,node);
    }
    //========================================================
    public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p,TreeNode q){
        // 1.某一个结点为根
        // 2.在根同一边
        // 3.在根左右两边
        //某一节点为根节点  则肯定是公共祖先节点
        if(root == null)
            return root;
        boolean pL = false, pR = false, qL = false, qR = false;
        //某一个节点为当前树的根
        if(root == p || root == q){
            return root;
        }
        //同一边
        if(find(root.left, p)){
            pL = true;
            pR = false;
        }else{
            pR = true;
            pL = false;
        }
        if(find(root.left, q)){
            qL = true;
            qR = false;
        }else{
            qR = true;
            qL = false;
        }
        //同一边
        if(pL && qL){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(pR && qR){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            //两边
            return root;
        }
    }
    //========================================================
    //获取路径
    public boolean getPath(TreeNode root, TreeNode node, Stack<TreeNode> st){
        if(root==null){
            return  false;
        }
        //入栈
        st.push(root);
        if(root==node){
            return  true;//结束
        }
        //判断左右子树是否存在node
        if(getPath(root.left,node,st)){
            return  true;
        }
        if(getPath(root.right,node,st)){
            return  true;
        }
        //当前root出栈
        st.pop();
        return  false;
    }
    //========================================================
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> path1 = new Stack<>();
        Stack<TreeNode> path2 = new Stack<>();
        getPath(root, p, path1);
        getPath(root, q, path2);
        //裁剪路径
        while(path1.size() != path2.size()){
            if(path1.size() > path2.size()){
                path1.pop();
            }else{
                path2.pop();
            }
        }
        //匹配
        while(path1.size() != 0){
            if(path1.peek() == path2.peek())
                break;
            else{
                path1.pop();
                path2.pop();
            }
        }
        return path1.peek();
    }
    //========================================================
    //建立一个二叉树---[3 5 1 6 2 0 8 7 4]  层序排列
    public  TreeNode buildTree(){
        TreeNode root =new TreeNode(3);
        TreeNode node2=new TreeNode(5);
        TreeNode node3=new TreeNode(1);
        TreeNode node4=new TreeNode(6);
        TreeNode node5=new TreeNode(2);
        TreeNode node6=new TreeNode(0);
        TreeNode node7=new TreeNode(8);
        TreeNode node8=new TreeNode(7);
        TreeNode node9=new TreeNode(4);
        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        node5.left=node8;
        node5.right=node9;
        return  root;
    }


}
