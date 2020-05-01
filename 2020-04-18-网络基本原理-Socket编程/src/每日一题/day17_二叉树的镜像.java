package 每日一题;

 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;
     }
 }

public class day17_二叉树的镜像 {
     public static void Mirror(TreeNode root) {
         if(root!=null){
             TreeNode tmp;
             tmp=root.right;
             root.right=root.left;
             root.left=tmp;
             Mirror(root.left);
             Mirror(root.right);
         }else {
             return;
         }
     }
     public  static void printBinary(TreeNode root){
         if(root!=null){
             System.out.println(root.val);
         }
         printBinary(root.left);
         printBinary(root.right);
     }

     public static void main(String[] args) {
         //前序遍历
         TreeNode node1=new TreeNode(8);
         TreeNode node2=new TreeNode(6);
         TreeNode node3=new TreeNode(10);
         TreeNode node4=new TreeNode(5);
         TreeNode node5=new TreeNode(7);
         TreeNode node6=new TreeNode(9);
         TreeNode node7=new TreeNode(11);
         node1.left=node2;
         node1.right=node3;
         node2.left=node4;
         node2.right=node5;
         node3.left=node6;
         node3.right=node7;

         TreeNode root=node1;
         System.out.println("源二叉树");
         printBinary(root);
         Mirror(root);
         System.out.println("镜像二叉树");
         printBinary(root);
     }

}
