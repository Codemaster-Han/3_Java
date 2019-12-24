//递归
//先序遍历字符串-->变成中序遍历字符串
class Node{
    char value;
    int val;
    Node left;
    Node right;
    Node(char value){
        this.value=value;
    }
    Node(int val){
        this.val=val;
    }
}



public class PreTraversal {
    //2.先建树
    static int i = 0;
    public static Node buildTree(String s,int i){
        if(s.charAt(i) != '#'){
            Node root = new Node(s.charAt(i));
            ++i;
            root.left = buildTree(s);
            ++i;
            root.right = buildTree(s);
            return root;
        }
        return null;
    }
    //3.中序遍历
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    //实例化
    public static void main(String[] args) {
        //获取输入
        /*2
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        */
        String line = "cf#g#ny#h#t##hpg##h#e##oebr####h##r##";
        //建树
        Node root = buildTree(line);
        //中序遍历
        inOrder(root);
        System.out.println();
    }

}

