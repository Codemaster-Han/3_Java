/**
功能描述：
给定两个int变量，交换变量的值
*/
public class Change 
{
	/*
	//方法一  创建一个临时变量
    public static void main (String[] args)
	{
		int a=4;
		int b=5;
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.printf("a=%d,b=%d%n",a,b);
	}
	*/
	
	/*
	//方法二  异或
	public static void main(String[] args)
	{
		int a=7;
		int b=8;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("a=%d,b=%d",a,b);
	}
	*/
	
	
	//方法三  加减
		public static void main(String[] args)
	{
		int a=9;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a的值"+"="+a);
		System.out.println("b的值"+"="+b);
	}
	
	
}