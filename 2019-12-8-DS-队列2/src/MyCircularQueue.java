//用顺序表 实现 循环队列
//尾插 --头删
/*
MyCircularQueue(k): 构造器，设置队列长度为 k 。
        Front: 从队首获取元素。如果队列为空，返回 -1 。
        Rear: 获取队尾元素。如果队列为空，返回 -1 。
        enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
        deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
        isEmpty(): 检查循环队列是否为空。
        isFull(): 检查循环队列是否已满。
*/
public class MyCircularQueue {
    int[] array;
    int firstIndex;
    int lastIndex;
    int size;

     /** Initialize your data structure here. Set the size of the queue to be k. */
     public MyCircularQueue(int k) {
         array=new int[k];
         firstIndex=lastIndex=0;
         size=0;
     }

     //入队
     /** Insert an element into the circular queue. Return true if the operation is successful. */
     public boolean enQueue(int value) {
         if(!isFull()){
             array[lastIndex]=value;
             lastIndex=(lastIndex+1)%(array.length);
             size++;
             return true;
         }
         return  false;
     }

     //出队
     /** Delete an element from the circular queue. Return true if the operation is successful. */
     public boolean deQueue() {
        if(isEmpty()){
            return  false;
        }
        firstIndex=firstIndex+1;
        size--;
        return  true;
     }

     /** Get the front item from the queue. */
     public int Front() {
         if(isEmpty()){
             return  -1;
         }
        return  array[firstIndex];
     }

     /** Get the last item from the queue. */
     public int Rear() {
         if(isEmpty()){
             return  -1;
         }
        return  array[lastIndex-1];
     }

     /** Checks whether the circular queue is empty or not. */
     public boolean isEmpty() {
        if(size==0){
            return  true;
        }
        return false;
     }

     /** Checks whether the circular queue is full or not. */
     public boolean isFull() {
         if((lastIndex+1)%array.length==firstIndex){
             return  true;
         }
         return false;
     }

    public static void main(String[] args) {
        MyCircularQueue queue=new MyCircularQueue(7);
        System.out.println(queue.isEmpty());//true

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);//1 2 3 4
        System.out.println(queue.isEmpty());//false

        System.out.println(queue.Front());//1
        System.out.println(queue.Rear());//4

        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.Front());//3
        System.out.println(queue.Rear());//4

        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.Front());//-1
        System.out.println(queue.Rear());//-1

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);//1 2 3 4 5 6 7
        System.out.println(queue.isFull());


    }
}
