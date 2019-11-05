public class Array{
	
	public static void main(String[] args){
		int[] arr=new int[] {0,1,2,3,4,5,2,6};
		int n=2;
		int w=arr1(arr);
		double x=arr2(arr);
		int y=arr3(arr,n);
		int z=arr4(arr,n);
		System.out.println("最大值为"+ w); //6
		System.out.println("平均值为"+x); //2.875
		System.out.println("第一个下标为"+y); //2
		System.out.println("最后一个下标为"+z); //6
	}
	
	
	//给定数组，返回数组中的最大值
	
	public static int arr1(int arr[]){
			int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if (arr[0]>=arr[i]){
			    max=arr[0];
			}
			else {
				max=arr[i];
			}
		}
		return max;
	}
	
	//给定数组，计算数组的平均值，返回值应该是double类型
	public static double arr2(int arr[]){
			double sum=0.0;
			int size=arr.length;
			for(int i=0;i<size;i++){
				sum+=arr[i];
			}
			double average=sum/size;
			return 	average;
		}
		
	//给定数组，和一个具体的值，返回该值在数组中第一次出现的下标
	public static int arr3(int arr[],int a){
		for(int i=0;i<arr.length;i++){
				if(a==arr[i]){
					return i;
				}
			}
		return -1;	
	}

	//给定数组，和一个具体的值，返回该值在数组中最后一次出现的下标
	//思路：从后往前找，找到第一个
		public static int arr4(int arr[],int a){
			for(int i=arr.length-1;i>0;i--){
				if(a==arr[i]){
					return i;
				}	
		    }
			 return -1;	
		}
	  
}

