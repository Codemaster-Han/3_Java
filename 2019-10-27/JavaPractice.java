public class  JavaPractice 
{
	public static void main (String[] args)
	{
		/*
		//打印字符串
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args.length);
		*/
		//===========================================
		/*
		//循环打印字符串
		for (int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		*/
		//===========================================
		/*
		if(args.length<2)
		{
			System.out.println("请输如两个数字");
			return;
		}
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int sum=x+y;
		//3 5
		//3+5相加的结果等于8
		String message = String.format("%d + %d 相加的结果是 %d", x, y, result);
		System.out.println(message);
		
		System.out.println(""+x+"+"+y+"相加的结果等于"+sum);
		System.out.printf("%d+%d相加的结果是%d%n",x,y,sum);
		System.out.format("%d+%d相加的结果是%d%n",x,y,sum);
		*/
		//===========================================
		/*
		//输出数字  字符串类型转成数字类型
		int c=10;
		System.out.println(c);
		
		String s="12345";
		System.out.println(Integer.parseInt(s));
		System.out.println(Long.parseLong(s));
		System.out.println(Double.parseDouble(s));
		System.out.println("===================");
		
		// 数字类型 转成 字符串类型
		int x = 38;
		long y = 39L;
		double z = 3.1415;
		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(y));
		System.out.println(String.valueOf(z));
		*/
		//===========================================
	}
}
		