public class JudgeIsSameTree {
    //判断两个树是否相同
    public boolean isSameTree(Node root1,Node root2){
        if(root1==null&&root2==null){ //两个子树结构相同
            return  true;
        }
        if(root1==null||root2==null){//两个子树结构不同
            return false;
        }
        if((root1.value==root2.value)&&isSameTree(root1.left,root2.left)&&isSameTree(root1.right,root2.right)){
            return  true;
        }else{
            return  false;
        }
    }

    //判断树s是否是包含这个子树t
    public boolean isSubTree(Node s,Node t){
        if(s==null){
            return  false;
        }
        if(isSameTree(s,t)){  //每次重新遍历整个新的树
            return  true;
        }
        if(isSubTree(s.left,t)){
            return  true;
        }
        if(isSubTree(s.right,t)){
            return  true;
        }else {
            return  false;
        }
    }

    //求二叉树的最大深度
    public  int  deepTree(Node root){
        if(root==null){
            return  0;
        }else {
            return  Math.max(deepTree(root.left),deepTree(root.right))+1;
        }
    }

    //判断一个二叉树是否是平衡二叉树
    public boolean isBlanceTree(Node root){
        if(root==null){
            return true ;
        }
        int left=deepTree(root.left);
        int right=deepTree(root.right);
       return  Math.abs(left-right)<2&&isBlanceTree(root.left)&&isBlanceTree(root.right);
    }

    //1、左右子树的根相同
    //2、左边的左边=右边的右边
    //3、左边的右边=右边的左边
    public  boolean _isSymmetryTree(Node left,Node right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return  false;
        }
        return (left.value==right.value)&&_isSymmetryTree(left.left,right.right)&&_isSymmetryTree(left.right,right.left);
    }
    //对称二叉树---镜像对称（左子树的左边==右子树的右边）
    public  boolean isSymmetryTree(Node root){
        if(root==null){
            return  true;
        }
        return  _isSymmetryTree(root.left,root.right);
    }

}
