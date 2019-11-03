public class RecursionDemo {
	public static int an(int n) {
		if (n == 1) {
			return 1;
		} else {
			return an(n - 1) + 1;
		}
	}
	
	// 求 n 的阶乘
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			int a = factorial(n - 1);
			int r = a * n;
			return r;
			//return factorial(n - 1) * n;
		}
	}
	
	// 求第 n 项的斐波那契数
	public static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			int r = 1;
			return r;
		} else {
			int a = fibonacci(n - 1);
			int b = fibonacci(n - 2);
			return a + b;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			//System.out.println(an(i));
			System.out.println(fibonacci(i));
		}
	}
}