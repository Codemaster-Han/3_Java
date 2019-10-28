public class Average
{
	/*
	//==============================================================
	//求平均数
	public static void main(String[] num)
	{
		//int a=num.length;       
		//double average=0;错误   必须是double average=0.0;
		int sum=0;
		for (int i=0;i<num.length;i++)
		{
			sum+=Integer.parseInt(num[i]);
		}
		average=1.0*sum/(num.length);	
		System.out.println("平均值是:"+average);
	}
	*/
	//==============================================================
		public static void main(String[] args)
	{
		//操作符练习————在java中和在c中有区别  java中操作数是布尔类型
		System.out.println(1 == 1);//true   关系运算符 的表达式和返回值都是boolean类型——> true  false
		System.out.println(1 != 1);//false
		System.out.println(1 == 1 & 2 == 2);//true   单个的&和逻辑&&的区别 ：单个&不支持短路求值  
		System.out.println(1 == 2 & 2 == 2);//false
		System.out.println(1 == 2 && 5 / 0 > 10);//false   逻辑运算符 的操作数和返回值都是boolean类型——> true  false
		                                         //        注意短路求值：当&&的左边表达式为false时，就不用计算右边的表达式了
												 //                      当||的左边表达式为true时，就不用计算右边的表达式了
		
		System.out.println("=========================");
		
	}
	//==============================================================
	/*
	//位运算学习（二进制位）  ，对二进制的每一个位进行操作  
	//按位与&  按位或|   按位取反~  按位异或^   
	//移位运算  左移<<,最右侧补零    右移>>，最左侧补符号位或者补零
	//将一个数的 2-4位变成0  其他不变
		public static void main(String[] args)
	{
		int n=25;//0001 1001
        // 得到 n 的第2-4位   110
		System.out.println((n >> 2) & 0x7);//6  先右移两位  0000 0110    按位与  0x7  =0x0000 0111   得结果 0x 0000 0110=6
		// 把 n 的第2-4位置0，其余不变
		int mask = ~(0x7 << 2);//先左移两位 0x0001 1100  再取反 0x11100011
		System.out.println(n & mask);//1		
		System.out.println("=========================");
		
	}
	*/
}