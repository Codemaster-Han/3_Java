import java.util.Scanner;

public class Binary{
	public static void main(String[] args){
		int num1=number1(15);
		int num2=number2(15);
		int num3=number3(15);
		System.out.println("除2取余法  二进制中1的个数有： "+num1+"个");
		System.out.println("移位法     二进制中1的个数有： "+num2+"个");
		System.out.println("按位“与”法 二进制中1的个数有： "+num3+"个");
		odevity(11);
		System.out.println("该整数的每一位数是>逆序输出：");
		printNumber(1784);
		System.out.printf("\n");
		System.out.println("该整数的每一位数是>正序输出：");
		printNumber2(1784);
		printNumber3(13);
		
	}
	
	//写一个函数返回参数二进制中1的个数   
	//eg: 15->  补码为0000 1111  ->  4个1
	//方法一：除2取余法。对一十进制数，用2辗转相除至结果为1，将余数和最后的1从下向上倒序写就是对应的二进制。   缺点：对于负数不行
	//方法二：移位法。移位法分为左移和右移两种情况，左移时数的右边都补0；右移时正数左边补0，负数左边补1。       缺点：效率低
	//方法三：按位“与”法，即x=x&(x-1)。此方法不仅可以对正负数进行十进制到二进制的转化，而且效率高。
	
	//除2余法
	public static int number1(int num){  
	      int count1=0;
          while(num>0){   //while语句里面必须是布尔类型
                 if(num%2==1)count1++;//如果num除2的余数为1时，即为二进制中1
                 num=num/2;
              }
          return count1;
	}
	
	//移位法
	public static int number2(int num2){  
			int count2=0;
			for (int i=32;i>0;i--){  //32或64位比特位
				if((num2&1)==1) count2++;
				num2=num2>>1;//>>右移运算符；右移时负数补1、正数补0，num>>1指右移1位
			}
			return count2;
	}
	
	
	//按位与
	public static int number3(int num){   
		int count3=0;
		while(num>0){
			num=num&(num-1);//num不为0时，每进行一次与运算，则二进制中1的个数加1
			count3++;
		}
		return count3;
	}


   //获取一个数二进制序列当中所有的偶数位和奇数位，分别输出二进制序列
   //eg:  11的二进制为01011  输出为 -> 奇数序列:0 0 1   偶数序列:1 1
   
   public static void odevity(int value){
	   int count=0;
	   int[] arr1=new int[32];
	   //注意：int arr[32]={0};    int arr1[]={0}; 是错误的 
	   int i=0;
	   while(value>0){
		   arr1[i++]=value%2;
		   value/=2;
		   count++;
	   }
	   System.out.println("奇数序列：");
	   for (i=count;i>=0;i=i-2){
		   System.out.printf("%d  ",arr1[i]);
	   }
	   System.out.printf("\n偶数序列：\n");
	   for (i=count-1;i>=0;i=i-2){
		   System.out.printf("%d  ",arr1[i]);
	   }  
       System.out.printf("\n");	   
   }

    //输出一个整数的每一位
	//可以用递归  逆序输出或者 正序输出
	//或者键盘输入，存放在数组中
    public static void printNumber(int num4){
		if(num4<10){
			System.out.printf("%d  ",num4);
		}else{
			int b=num4/10;
			int c=num4%10;
			//printNumber(b);//递归正序输出  先调用 后打印
			System.out.printf("%d  ",c);//递归逆序输出  先打印 后调用 
			printNumber(b);

	    }
	}
	
	    public static void printNumber2(int num5){
          int i=num5/10;
		  if(i!=0){
			  printNumber2(i);
		  }
		  System.out.printf("%d  ",num5%10);//递归正序输出
	}
	
	


	
    public static void printNumber3(int args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("\n请输入一个整数：>");
        int num = scan.nextInt();
        char[] numChar = Integer.toString(num).toCharArray();
        for(int i = 0;i<numChar.length; i++) {
            System.out.printf("%c  ",numChar[i]);
        }
    }

	
}

