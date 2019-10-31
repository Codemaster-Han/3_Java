public class ConditionDemo
{
	/*
	//判断是否是闰年
	public static void main (String[] args)
	{
      int  year=Integer.parseInt(args[0]);
	  if (year%400==0)
	  {
		  System.out.printf("是闰年");
	  }
	  else if ((year%4==0)&&(year%100!=0))
	  {
		  System.out.printf("是闰年");
	  }
	  else
	  {
		  System.out.printf("不是闰年");
	  }
	}
	*/
	
	
	/*
	//输入1-7，输出星期几
	public static void main(String[] args){
		int today=Integer.parseInt(args[0]);
		switch (today){
			            case 1:{
				System.out.printf("星期一");
				break;
			}
						case 2:{
				System.out.printf("星期二");
				break;
			}
						case 3:{
				System.out.printf("星期三");
				break;
			}
						case 4:{
				System.out.printf("星期四");
				break;
			}
						case 5:{
				System.out.printf("星期五");
				break;
			}
						case 6:{
				System.out.printf("星期六");
				break;
			}
						case 7:{
				System.out.printf("星期天");
				break;
			}
						
			default:{
				System.out.printf("输入了不合格的参数");
			}
		}
	}
	*/
	
	//求阶乘的和 1！+2！+3！+4!+5!
	public static  void main(String[] args)
	{
		int num=5;
		int n=1;
		int i=1;
		int result=1;
		int sum=0;
		while(n<=num)
		{
			while(i<=n)//求单个的阶乘
			{	
			result*=n;
			i++;
			}
			sum+=result;//求阶乘和
			n++;
		}
	System.out.printf("输出5的阶乘的和=%d",sum);
	}
		
	
}	
