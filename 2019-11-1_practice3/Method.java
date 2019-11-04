public class Method{
	public static void main (String[] args){
		int n=6;
		int mult=factorial(n);
		int mult2=factorial2(n);
		int y=10;
		int sum=summation(y);
		int sum2=summation2(y);
		System.out.printf("非递归，n的阶乘=%d%n",mult);
		System.out.printf("  递归，n的阶乘=%d%n",mult2);
		System.out.printf("1~10的求和结果=%d%n",sum);
		System.out.printf("1~10的求和结果=%d%n",sum2);
		int z=1234;
		print(z);
		int w=2345;
		int sum3=summation3(w);
		System.out.printf("2345的数字组合之和的结果=%d%n",sum3);
		int n2=5;
		int Fibonacci=Fibonacci(n2);
		System.out.printf("斐波那契数列第5项为=%d%n",Fibonacci);
		hanoi(3, 0, 2);//设置总共有3个盘子  ，3个柱子编号为0 1 2 
		int n3=14;
		int num=forgFib(n3);
	    System.out.printf("青蛙跳台阶方法次数=%d%n",num);
	
	}
	
	
	//非递归 求n的阶乘
	public static int factorial(int x){
		int m=1;
		for (int i=1;i<=x;i++){
			m*=i;
		}
		return m;
	}
	
	//递归 求n的阶乘
	public static int factorial2(int x){
		if(x==1)
			return 1;
		else 
			return x*factorial2(x-1);	
	}
	
	//非递归 求1+2+3+4、、、+10
	public static int summation(int y){
		int s=0;
		for(int i=1; i<=10; i++){
			s+=i;
		}
		return s;
	}
	
	//递归 求1+2+3+4、、、+10
	public static int summation2(int y){
		if(y==1)
			return 1;
		else
			return y+summation2(y-1);
	}
	
	//按照顺序打印一个数字的每一位（例如1234  打印  1 2 3 4）
	public static void print(int z){
		if (z<10){
		     System.out.printf("打印的结果为=%d%n",z);
		}
		else {
			 print(z/10);// 除了最低位之外，进行递归
		     System.out.printf("打印的结果为=%d%n",z%10);
		}
	}
	
	//写一个递归方法，输入一个非负整数，返回组成它的数字之和  （例如 2345  输出 2+3+4+5=14）
	public static int summation3(int w){
		if(w<10){  //当w为1位数时
		     return w;
		}
		else{
			return summation3(w/10)+w%10;
		}
	}
	
	
	//求斐波那契数列的第n项
	public static int Fibonacci(int f){
		if (f==0||f==1){
			return 1;
		}
		else{
			return Fibonacci(f-1)+Fibonacci(f-2);
		}
	}

    //求解汉诺塔问题   要求小盘子必须在大盘子上面   把3个盘子从0号柱子上移动到2号柱子上
	public static void hanoi(int n,int from,int to){
		if(n==1){
			System.out.printf("从 %d 移动到 %d%n", from, to);//只有一个盘子时
		}
		else{
			int other=3-from-to;  //代表下一步要移动到第other号柱子
			hanoi(n-1,from,other);
			System.out.printf("从 %d 移动到 %d%n", from, to);//最后一步
			hanoi(n-1, other, to);
		}
	}
	
	//青蛙跳台阶问题  一只青蛙一次可以跳1级台阶，也可以跳2级台阶
	//求该青蛙跳上一个n级的台阶总共有多少种跳法
	//思路：当n = 1， 只有1中跳法；当n = 2时，有两种跳法；当n = 3 时，有3种跳法；当n = 4时，有5种跳法；当n = 5时，有8种跳法；.......
    // 规律类似于Fibonacci数列
	public static int forgFib(int n){
		
			if (n == 1)
			{
				return 1;
			}
			else if (n == 2)
			{
				return 2;
			}
			else
			{
				return forgFib(n - 1) + forgFib(n - 2);
			}
	}
	
}
	
	
	