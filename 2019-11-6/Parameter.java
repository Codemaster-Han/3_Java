//	Parameter=形参  argument=实参
import java.util.Arrays ;
import java.util.Scanner;

public class Parameter {
	public static void main(String[] args){
		int[] ar1 = { 1, 2, 3, 4 };
		int[] ar2 = { 9, 7, 3, 2 };
		swap(ar1, ar2);	//两个数组未完成交换，因为形参只是实参的一份临时拷贝
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 5, 4, 3, 2, 1 };
		int[] c = { 3, 3, 3, 3, 3 };
		int[] d = { 1, 9, 3, 7, 7 };
		bubbleSort(a);//冒泡排序
		bubbleSort(b);
		bubbleSort2(c);
		bubbleSort2(d);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

		int[] e=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(e,3));//二分查找
		System.out.println(binarySearch2(e,3));
		int[] f={1,2,3,4,5};
		copyOf(f,3);  //数组拷贝
		fill(f,2); //数组填充
		
	}
	
   //不能交换成功 
	public static void swap(int[] a, int[] b) {
		int[] t = a;
		a = b;
		b = t;
	}
	
	
    //可以交换成功
	public static void swap2(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	
	//原地排序--正序冒泡   要进行数组的长度-1次冒泡      ->两两交换，将最大的数字放在后面     eg: 2146983->1234689  第一次冒泡将9放在最后面
	public static void bubbleSort(int[] arr1){
		int size=arr1.length;
		int i=0;
		int t=0;
		for(i=0;i<size-1;i++){  //总共冒泡 数组长度-1次
			for (int j = 0; j < arr1.length - i - 1; j++) {  // j ~ [0, a.length - i - 1) 
			    if(arr1[j]>arr1[j+1]){                        // j 和 j + 1 下标对比    比大小，进行交换  大的在后面
				    t=arr1[j];
				    arr1[j]=arr1[j+1];
				    arr1[j+1]=t;
			    }				
			}
		}
	}
	

	//冒泡排序2  
	public static void bubbleSort2(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// j ~ [0, a.length - i - 1)
			for (int j = 1; j < a.length - i; j++) {
				// j 和 j - 1
				if (a[j - 1] > a[j]) {
					swap2(a, j - 1, j);
				}
			}
		}
	}
	
	
	//二分查找——前提：数组是有序的，找不到返回-1；  {1 2 3 4 5 6 7 8 9}   找到了返回其下标
	//先查找  比大小  移动左右中间坐标
	public static int binarySearch(int[] arr2,int value){
		//查找的范围是[left , right)  左闭右开
		int left=0;
		int right=arr2.length;
		while(left<right){      
			int middle=(left+right)/2;
			if(value==arr2[middle]){
				return middle;
			}
			else if(value<arr2[middle]){
				right=middle;
			}else{
				left=middle+1;
			}
		}
		return -1;
	}
	
	
	
	public static int binarySearch2(int[] arr2,int value){
	//查找的范围是[left , right]   左闭右闭
		int left=0;
		int right=arr2.length-1;  //变动1
		while(left<=right){       //变动2
			int middle=(left+right)/2;
			if(value==arr2[middle]){
				return middle;
			}
			else if(value<arr2[middle]){
				right=middle-1;   //变动3
			}else{
				left=middle+1;
			}
		}
		return -1;
	}
	
	//进行数组的复制  返回一个新数组 数组长度为newLength
    public static int[] copyOf(int[] a,int newLength){
		int[] x= new int [newLength];  //新数组中默认值为全0
		//int length=newLength<a.length ? newLength :a.length ;   //求要拷贝的最小长度
		int length=Math.min(newLength,a.length);
		for(int i=0;i<length;i++){
			x[i]=a[i];
		}
		System.out.println(Arrays.toString(x));
		return x;
	}
	
	//给数组里面填充具体的值
	public static void fill(int[] a,int val){
		for(int i=0;i<a.length;i++){
			a[i]=val;
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	
	
	
}

	

