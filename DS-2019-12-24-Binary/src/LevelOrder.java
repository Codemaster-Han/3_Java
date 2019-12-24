import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//层序遍历 把每一层的结果放在一个数组里面
public class LevelOrder {
    public List<List<Integer>> leverOrder(Node root){
        List<List<Integer>> array=new ArrayList<>();//二维数组
        Queue<Node> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){//遍历层
            //取出队列上现存的所有元素----
            int size=queue.size();
            List<Integer> rowNode=new ArrayList<>();//存放行
            while(size>0){//遍历行的节点个数
                Node topNode=queue.poll();
                rowNode.add(topNode.val);

                //入队孩子节点
                if(topNode.left!=null){
                    queue.offer(topNode.left);
                }
                if(topNode.right!=null){
                    queue.offer(topNode.right);
                }
                --size;
            }
            array.add(rowNode);
        }
        return  array;
    }


}
