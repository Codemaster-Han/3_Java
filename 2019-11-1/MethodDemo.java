import java.util.Scanner;
// 错误的位置：public static void method() {}

public class MethodDemo {
	// 只有这里可以定义方法
	
	// 求两个数的和
	// 1. 需要几个参数		2 个
	// 2. 参数是什么类型	int
	// 3. 返回值的类型		int
	// 4. 方法名称			add/sum	
	
	// a, b 是形参(paramters)
	public static int add(int a,int b) {
		int r = a + b;
		// 方法如何把结果传递出去（如何返回）
		return r;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	// 计算两个 double 类型的减法，并打印返回结果 sub
	public static double sub(double x, double y) {
		return x - y;
	}
	// 交换两个变量的值
	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	
	public static void main(String[] args) {
		// 错误的位置: public static void method() {}
		
		/*
		int a = 1;
		int b = 3;
		// a, b 是实参(arguments)
		int r = add(a, b);
		System.out.println(r);
		System.out.println(sub(a, b));
		*/
		
		/*
		int a = 10;
		int b = 21;
		swap(a, b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		*/
		
		/*
		int a = 1;
		int b = 10;
		int c = add(a, b);
		int d = add(b, c);
		int e = add(a, d);
		
		int f = add(a, add(b, add(a, b)));
		*/
		
		// 让用户输入:
		// 2. Scanner
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(sum(n));
		// 1. args
		//System.out.println(sum(Integer.parseInt(args[0])));
		/*
		String s = args[0];
		int n = Integer.parseInt(s);
		int r = sum(n);
		System.out.println(r);
		*/
	}
	// 1! + 2! + 3! + 4! + 5!
	// 1. 求阶乘的方法
	public static int factorial(int n) {
		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor *= i;
		}
		
		return factor;
	}
	
	// 2. 求1到n的阶乘的和的方法
	public static int sum(int n) {
		if (n <= 1) {
			return -1;
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += factorial(i);
		}
		
		return sum;
	}
}










