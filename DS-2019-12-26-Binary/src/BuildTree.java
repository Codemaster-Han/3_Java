/**
根据一棵树的前序遍历与中序遍历构造二叉树。
 注意:你可以假设树中没有重复的元素。
 例如，给出   前序遍历 preorder = [3,9,20,15,7]  中序遍历 inorder = [9,3,15,20,7]
 返回如下的二叉树：
       3
     /  \
     9   20
         /  \
        15   7
*/

//思路： 根据根在中序遍历中确定当前树的左右区间
public class BuildTree {
    static int curIdx = 0;
    public TreeNode _buildTree(int[] pre, int[] in, int inS, int inE){
        //空树--pre从前插   in从中插  ins起始位置  ine结束位置
        if(inS > inE)
            return null;
        int rootValue = pre[curIdx];
        curIdx++;
        TreeNode root = new TreeNode(rootValue);
        //区间中除过根元素，没有孩子节点
        if(inS == inE)
            return root;
        //确定左右子树的区间
        int i;
        for(i = inS; i <= inE; ++i){
            if(in[i] == rootValue)
                break;
        }
        //左右子树的区间：
        //左子树： [inS, i - 1]
        //右子树： [i + 1, inE]
        //构建左右子树
        root.left = _buildTree(pre, in, inS, i - 1);
        root.right = _buildTree(pre, in, i + 1, inE);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //重置
        curIdx = 0;
        return _buildTree(preorder, inorder, 0, preorder.length - 1);
    }
}
