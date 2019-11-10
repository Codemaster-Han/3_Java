/**
  数组的旋转，  {1,2,3,4,5,6,7}  左旋3位 ->   {4,5,6,7,1,2,3}
*/
import java.util.Arrays;
import java.util.Scanner;

public class Array{
	public static void main(String[] args){
		int[] arr1=new int[] {1,2,3,4,5,6,7};
		int[] arr2=new int[7] ;//{0,0,0,0,0,0,0}
		
		while(true){
		Scanner n=new Scanner (System.in);
		System.out.println("请输入想要旋转的位数->");
		int number=n.nextInt();
		int[] arr3=rotate(number,arr1,arr2);
		
		System.out.println("旋转前数组"+Arrays.toString(arr1));
		System.out.println("旋转后数组"+Arrays.toString(arr3));
		}
	}
	
	public static int[] rotate(int number,int[] arr1,int[] arr2){
		int w=number%7;
		if(w!=0){
			for (int i=0;i<7;i++){
				arr2[i]=arr1[w];
				w++;
				if(w>=7){
					w=0;
				}
			}
			return arr2;
		}else{
			return  arr1;
		}
	}
	
}