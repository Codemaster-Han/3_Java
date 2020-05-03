package 每日一题;
import java.util.*;
 class TreeNode2 {
    int val = 0;
    TreeNode2 left = null;
    TreeNode2 right = null;
    public TreeNode2(int val) {
        this.val = val;
    }
}
public class day23_二叉树平衡检查 {
    public class Balance {
        public boolean isBalance(TreeNode2 root) {
           if(root.right==null&&root.left==null){
                return  true;
           }else {
               return  false;
           }

        }
    }
}
