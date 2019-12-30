/**
 * 二叉搜索树：
 * 1、根节点>左子树任何节点的值
 * 2、根节点值<右子树任何节点的值
 * 3、每一个子树也符合上述性质
 * 4、中序遍历为有序序列
 */
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
// 要求不能创建任何新的结点，只能调整树中结点指针的指向。
public class ConvertTree {
    static TreeNode prev = null;
    public void _Convert(TreeNode root){
        if(root == null)
            return;
        //中序遍历
        _Convert(root.left);
        //处理当前节点
        root.left = prev;
        if(prev != null)
            prev.right = root;
        prev = root;
        _Convert(root.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        //重置
        prev = null;
        _Convert(pRootOfTree);
        //返回头， 左边的最后一个非空节点
        while(pRootOfTree.left != null){
            pRootOfTree = pRootOfTree.left;
        }
        return pRootOfTree;
    }
}

