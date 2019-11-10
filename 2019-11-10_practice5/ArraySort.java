import java.util.Arrays;
public class ArraySort{
	public static void main(String[] args){
		int[] arr={5,3,2,4,7,6,9,8};
		System.out.println("排列前数组"+Arrays.toString(arr));
		Arrays.sort(arr,3,8);
		System.out.println("排列后数组"+Arrays.toString(arr));
		
	}
}


/*运行结果：
排列前数组[5, 3, 2, 4, 7, 6, 9, 8]
排列后数组[5, 3, 2, 4, 6, 7, 8, 9]
*/