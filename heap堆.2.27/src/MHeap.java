import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

//大堆，小堆
public class MHeap {
    //1：交换
    public  static  void sweap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[i]=temp;
    }
    //2:大堆----向下调整
    public static void shiftDownBig(int[] arr,int sz,int parent ){
        int child=2*parent+1;
        //从parent节点开始，一直调整到叶子结点结束
        while (child<sz){
            //right child: child+1
            if(child+1<sz&&(arr[child+1]>arr[child])){
                child++;
            }
            if(arr[child]>arr[parent]){
                //如果child大于parent，向下调整，交换值
                sweap(arr[child],arr[parent]);
                //更新位置
                parent=child;
                child=2*parent+1;
            }else {
                break;//不需要调整
            }
        }
    }
    //  小堆----向下调整
    public static void shiftDownSmall(int[] arr,int sz,int parent ){
        int child=2*parent+1;

    }
    //  大堆---向上调整
    public  static  void shiftUpBig(int[] arr,int sz,int child){
        int parent=(child-1)/2;
        while (child>0){
            if(arr[child]>arr[parent]){
                sweap(arr,child,parent);
                //继续向上更新
                child=parent;
                parent=(child-1)/2;
            }else {
                break;
            }
        }
    }
    //3:创建--大堆
    public  static  void creatHeapBig(int[] arr){
      //从最后一个非叶子结点开始往下调整
        for(int i=(arr.length-2)/2;i>=0;i--){
            shiftDownBig(arr,arr.length,i);
        }
    }
    //  创建--小堆
    public  static  void creatHeapSmall(int[] arr){
        for(int i=(arr.length-2)/2;i>=0;i--){
            shiftDownSmall(arr,arr.length,i);
        }
    }
    //4:主函数
    public  static  void main(String args[]){
        int[] arr={9,2,10,15,3,1,7,23,89};
        int[] copy=arr.clone();
        System.out.println(Arrays.toString(arr));
        creatHeapBig(arr);
        System.out.println(Arrays.toString(arr));
        creatHeapSmall(copy);
        System.out.println(Arrays.toString(copy));
        //优先级队列
        PriorityQueue<Integer> pq=new PriorityQueue<>();

    }

}
