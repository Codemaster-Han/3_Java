/**
顺序表学习
*/
import java.util.Arrays;
class MyArrayList{
	//属性
	int[] arr;
	int size;
	
	//构造方法 初始化
	MyArrayList(){
		arr=new int[10];
		size=0;
	}
	
	//普通方法
	
	//尾插
	//时间复杂度O(1)  与size有关
	//空间复杂度O(1) 
	public void pushBack(int element){
		/*
		arr[size]=element;
		size++;
		*/
		arr[size++]=element;
	}
	
	//尾删
	//时间复杂度O(1) 
	//空间复杂度O(1) 
	public void popBack(){
		if(size==0){
			//最好用异常
			System.out.println("空了");
			return ;
		}
		arr[--size]=0;
	}
	
	//头插
	public void pushFront(int element){
		/*
		//从后往前
		//i代表含义：空心  [size,1]
		for(int i=size;i>=1;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=element;
		size++;
		*/
		
		//i代表含义：实心 [size-1,0]
        for(int i=size-1;i>=0;i--){
			arr[i+1]=arr[i];
		}
		arr[0]=element;
		size++;
	}
	
	//头删
	//从前往后
	public void popFront(){
		//[1,size-1]  空心
	    for(int i=1;i<=size-1;i++){
			arr[i-1]=arr[i];
		}
		arr[size]=0;
		size--;
		//[0,size-2]  实心
	}
	
	//插入
	//从后往前搬
	public void insert(int element,int index){
		//i代表实心 [size,index]
		for(int i=size;i>=index;i--){
			arr[i]=arr[i-1];
		}
		arr[index]=element;
		size++;
	}
	
	//重载
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(arr,size));
	}
	
	//主执行  实例化
	public static void main(String[] args){
		MyArrayList list=new MyArrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		System.out.println(list);
		list.popBack();
		list.popBack();
		list.popBack();
		System.out.println(list);
		list.popBack();
		System.out.println(list);
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		System.out.println(list);
		list.popFront();
		System.out.println(list);
		list.insert(55,2);
		System.out.println(list);
		
		
	}
	
	
}

