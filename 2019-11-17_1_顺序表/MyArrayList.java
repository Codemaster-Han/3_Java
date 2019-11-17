import java.util.Arrays;
class MyArrayList{
	//属性 申请一个数组，存一个数据个数
	int[] arr;  
	int size;
	
	//构造方法 初始化
	public MyArrayList(int capacity){
		arr=new int[capacity];
		size=0;
	}
	
	//在第二个构造方法中调用上一个构造方法用 this(参数)；	
	public MyArrayList(){
		this(10);
	}
	
	//普通方法
    //插入元素
	public void insert(int index, int element){
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);//抛出异常
		}
		if(!checkCapacity(1)){  //1代表true
			ensureCapacity();
		}
		//i代表实心 [size,index]
		for(int i=size;i>index;i--){
			arr[i]=arr[i-1];
		}
		arr[index]=element;
		size++;
	}
	
	//删除
	public void erase(int index) {
		if (size == 0) {
			System.out.println("空的");
			return;
		}
		
		for (int i = index + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		
		arr[--size] = 0;
	}
	
		/*
	// O(1)
	public void pushBack(int element) {
		array[size++] = element;
	}
	
	// O(1)
	public void popBack() {
		if (size == 0) {
			System.out.println("空的");
			return;
		}
		
		// --size;
		array[--size] = 0;
	}
	
	// O(n)
	public void pushFront(int element) {
		for (int i = size; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = element;
		size++;
	}
	
	// O(n)
	public void popFront() {
		if (size == 0) {
			System.out.println("空的");
			return;
		}
		
		for (int i = 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		
		array[--size] = 0;
	}
	*/
	
	//尾插
	public void pushBack(int element) {
		insert(size, element);
	}
	//头插
	public void pushFront(int element) {
		insert(0, element);
	}
	//尾删
	public void popBack() {
		erase(size - 1);
	}
	//头删
	public void popFront() {
		erase(0);
	}
	
	//检查容量是否足够 
	// num代表要插入的数据个数  true表示够用   false表示不够用
	private boolean checkCapacity(int num){
		return size+num<=arr.length;
	}
	
	//扩容
	private void ensureCapacity(){
		// 策略：如果原来的 length 不够用，通常是扩大 2 倍
		//方法1
		/*
		//int newlength=arr.length<<1;  左移一位也代表乘以2
		int newlength=arr.length*2;
		int[] newArr=new int[newlength];
		for(int i=0;i<size;i++){
			newArr[i]=arr[i];
		}
		*/
        //方法2
		arr=Arrays.copyOf(arr,arr.length*2);
	}
	
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return arr[index];
	}
	
	public int set(int index, int element) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		int old = arr[index];
		arr[index] = element;
		return old;
	}
	
	//重载  复写一下toString
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(arr,size));//从原有的数据中拷贝size个
	}
	
	//主执行  实例化
	public static void main(String[] args) {
		/*
		MyArrayList list = new MyArrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		
		list.insert(3, 100);
		System.out.println(list);
		list.insert(5, 100);
		*/
		
		MyArrayList list = new MyArrayList(2);//capacity=2
		list.pushBack(1);
		list.pushBack(2);
		System.out.println(list.arr.length);//2
		list.pushBack(3);
		System.out.println(list.arr.length);//4  扩容后
		list.pushBack(4);
		System.out.println(list.arr.length);//4
		list.pushBack(5);
		System.out.println(list.arr.length);//8  扩容后
		list.pushBack(6);
		list.pushBack(7);
		System.out.println(list.arr.length);//8
	}
	
	
	
}