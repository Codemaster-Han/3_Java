import java.util.Scanner ;

public class Date{
	public static void main(String[] args){
		int age=Integer.parseInt(args[0]);
	    judgeAge(age);
		int number=age;
		primeNumber1(number);
		primeNumber2(number);
		//printPrime(number);
		int n=9;
		multiplication(n);//乘法口诀表
		System.out.println("\n请输入两个正整数>");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("%d%n",GCD(a,b));//最大公约数
		double sum=summation(100);
		System.out.println("1/1-1/2+1/3-1/4、、、+1/99-1/100求和为"+sum);
		System.out.println("1-100之间9的个数"+count(9));
		narcissistic();
		}
	
	//根据年龄来打印出当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56以上）
	public static void  judgeAge(int a){
		if(a<=18)
			System.out.println("是少年");
		else if (a<=28)
			System.out.println("是青年");
		else if (a<=55)
			System.out.println("是中年");
		else  
			System.out.println("是老年");
	}
	
	
	//判断一个数字是否是素数
	//质数（prime number）又称素数，有无限个。一个大于1的自然数，除了1和它本身外，不能被其他自然数（质数）整除
	//思路1：例如17就是素数，因为它不能被2~16的任一整数整除。
	//因此判断一个整数m是否是素数，只需把m被2~m-1之间的每一个整数去除，如果都不能被整除，那么m就是一个素数
	//思路2：只需被2~√m之间的每一个整数去除就可以了。如果m不能被2~√m间任一整数整除，m必定是素数。
	 public static void primeNumber1(int b){
	      int i,k;
          k=b-1;
          for(i=2;i<=k;i++)
               if(b%i==0)
                  break;
               if(i>k)
                  System.out.println(b+"是素数");
               else
                  System.out.println(b+"不是素数");
    }
	
	 public static void primeNumber2(int b){
	      int i,k;
          k=(int)Math.sqrt(b);
          for(i=2;i<=k;i++)
               if(b%i==0)
                  break;
               if(i>k)
                  System.out.println(b+"是素数");
               else
                  System.out.println(b+"不是素数");
    }
		 
    //打印1-100之间所有的素数    ???
	public static void printPrime(int number){
		for(int i=2;i<=100;i++){
			int k=(int)Math.sqrt(i);
          for(int j=2;j<=k;j++){
               if(i%j==0)
                  break;
               if(j>k)
			System.out.printf("1-100之间的素数有>%d ",i);
		  }
		}
	}
	
	//输出乘法口诀表 
      /*   1x1=1
           1x2=2 2x2=4 
           1x1=3 2x3=6 3x3=9 
      */
	
	public static void multiplication(int n){
		int i=1;//行
		int j=1;//列
		int mul=1;
		System.out.printf("乘法口诀表为：> ");
		for(i=1;i<=n;i++){
			System.out.printf("\n");//每一行结束以后进行换行
			for(j=1;j<=i;j++){
				mul=i*j;
			    System.out.printf("%d*%d=%d    ",j,i,mul);
			}
		}	
	}
	
	//求两个正整数的最大公约数  最小公倍数
	//最大公约数，也称最大公因数，指两个或多个整数共有约数中最大的一个。
	//求最大公约数有多种方法，常见的有质因数分解法、短除法、辗转相除法。
    //如6和12，6的因数有1，2，3，6；12的因数有1，2，3，4，6，12。它们最大公约数是6。
	
	//正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值
	public static int GCD(int a,int b){
		int t,m,c;
		if(a<b)
     {
         t=a;
         a=b;
         b=t;
     }
        m=a*b;
        c=a%b;
        while(c!=0)
     {
        a=b;
        b=c;
        c=a%b;
     }
	 System.out.println("其最大公约数为:>"+b);
	 System.out.println("其最小公倍数为:>");
	 return m/b;
     
	}
	

  //计算1/1-1/2+1/3-1/4、、、、、+1/99-1/100
  public static double summation(int x){
	  double s=0.00;
	  for(int i=1;i<=x;i++){
		  if(i%2==0){
		       s-=1.0/i;
		  }
		  else{
		      s+=1.0/i;
		  }
	  }
	  return s;
  }
	
	//编写程序数一下1-100之间的所有整数中出现多少个9
	public static int count(int y){
		int cnt=0;
		for (int i=1;i<=100;i++){
				if(i<10){
					cnt=1;
				}else if(i>10&&i%10==9){
					cnt+=1;
                }
		   }
		   return cnt+1;
	   }
	
	
	//求出0~999之间的所有水仙花数，并输出  水仙花数为：153 370 371 407
	//“水仙花数”是指一个三位数其各位数字的立方和等于该数本身
	//例如153是“水仙花数”，因为：153 = 1^3 + 5^3 + 3^3。
	public static void narcissistic( ){
		int a=0;
		int b=0;
		int c=0;
		System.out.printf("1000以内水仙花数有：>");
		for(int i=100;i<1000;i++){
			a=i%10;//得到个位
			b=(i/10)%10;//得到十位	
			c=i/100;//得到百位
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.printf("%d~",i);
			}
		}
	}
	
	
	

	
}





