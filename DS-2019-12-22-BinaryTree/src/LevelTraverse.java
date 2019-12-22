import java.util.LinkedList;
import java.util.Queue;

public class LevelTraverse {
    //层序遍历----------用队列   （先存放左边节点，再存放右边节点）
    public  void le(Node root){
        Queue<Node> queue=new LinkedList<>();
        if(queue==null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            //获取队头元素
            Node topNode=queue.peek();
            //入队孩子节点
            if(topNode.left!=null){
                queue.offer(topNode.left);
            }
            if(topNode.right!=null){
                queue.offer(topNode.right);
            }
        }
    }

    //（根据层序遍历）判断一棵树是不是完全二叉树
    public  boolean TwoTree(Node root){
        Queue<Node> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);//入队
        }
        //先全部入队，不论是不是有null
        while(!queue.isEmpty()){
            //获取队头元素--出队
            Node topNode=queue.poll();
            if(queue.peek()==null){
                break;
            }
            //入队孩子节点
            queue.offer(topNode.left);
            queue.offer(topNode.right);
        }
          //null后面的剩余元素全部出队
        while (!queue.isEmpty()){
            Node topNode=queue.poll();
            if(queue.peek()!=null){
                return  false;
            }
        }
        return  true;

    }
}
