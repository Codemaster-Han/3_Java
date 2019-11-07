import java.util.Arrays;
import java.util.Scanner;
public class Array{
		public static void main(String[] args) {
		/*
		int[] aFromArgs = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			aFromArgs[i] = Integer.parseInt(args[i]);
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		int[] aFromScanner = new int[5];
		for (int i = 0; i < 5; i++) {
			aFromScanner[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(aFromScanner));

	}
	
	
	/**
	 * 进行数组的复制，返回一个新的数组，数组长度是 newLength
	 * 如果 newLength <= 原数组长度的，进行截取
	 * 如果 newLength > 原数组长度, 其余位置用 0 填充
	 */
	public static int[] copyOf(int[] a, int newLength) {
		int[] dest = new int[newLength];
		// dest 现在的元素值是多少	0
		// int length = newLength < a.length ? newLength : a.length;
		int length = Math.min(newLength, a.length);
		for (int i = 0; i < length; i++) {
			dest[i] = a[i];
		}
		
		return dest;
	}
	
	public static int[] copyOfRange(int[] a, int from, int to) {
		int[] dest = new int[to - from];
		for (int i = from; i < to; i++) {
			dest[i - from] = a[i];
		}
		
		return dest;
	}
	
	public static void fill(int[] a, int val) {
		for (int i = 0; i < a.length; i++) {
			a[i] = val;
		}
	}
	
	public static void fill(int[] a, int from, int to, int val) {
		for (int i = from; i < to; i++) {
			a[i] = val;
		}
	}
	
	// public static void equals(int[] a, int[] b) {
		// if (a.length != b.length) {
			// return false;
		// }
		
		// for (int i = 0; i < a.length; i++) {
			// if (a[i] != b[i]) {
				// return false;
			// }
		// }
		
		// return true;
	// }
	
	
	
	// public static void arraycopy(int[] src, int srcPos, int dest, int destPos, int length) {
		// // src 和 dest 是否指向同一个数组对象
		// if (src == dest) {
			// int[] tmpArray = copyOfRange(src, srcPos, srcPos + length);
			// for (int i = 0; i < length; i++) {
				// dest[destPos + i] = tmpArray[i];
			// }
		// } else {
			// for (int i = 0; i < length; i++) {
				// dest[destPos + i] = src[srcPos + i];
			// }
		// }
	// }
	

}








