/**
给定三个int变量，求其中最大最小值
*/

public class MaxMin
{
	/*
	//写法一： 不适用临时变量
	public static void main(String[] args)
	{
		int a=3;
		int b=5;
		int c=8;
		int max=0;
		int min=0;
		System.out.printf("初始值a=%d,b=%d,c=%d%n",a,b,c);	
		if (a>=b)
		{
			if(a>c)
			{
				if(b>c)
					System.out.printf("最大值为=%d,最小值=%d%n",a,c);
				else
					System.out.printf("最大值为=%d,最小值=%d%n",a,b);
			}
		    else
			   System.out.printf("最大值为=%d,最小值=%d%n",c,b);
		}
		
		else  if(a<b)
		{
			if(a>c)
			{
				System.out.printf("最大值为=%d,最小值=%d%n",b,c);
			}	
			else 
			{
				if(b<c)
				System.out.printf("最大值为=%d,最小值=%d%n",c,a);
			    else
				System.out.printf("最大值为=%d,最小值=%d%n",b,a);
			}	
		}		
	}
	*/
	
	
	//写法2  创建临时变量
    public static void main(String[] args) 
	{
        int a = 6;
        int b = 9;
        int c = 10;
        int tmp = 0;
        if (a < b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (a < c) {
            tmp = c;
            c = a;
            a = tmp;
        }
        if (b < c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println("最大值 = " + a);
        System.out.println("最小值 = " + c);
    }
}
