public class Recursion2{
	//=====================================
	/*
	public static void main(String[] args){
		int num=9527;
		num=printsum(num);
		System.out .printf("数字之和为=%d",num);
	}
	public static int printsum(int x){
	  if (x<10){
		  return x;
	  }
	  else{
          return x%10+printsum(x/10);  //9+5+7+2=23
	  }
	}
	*/
	
	//=====================================
	//汉诺塔问题
	//在cmd上java Recursion2  运行时加上" >文件名"  便可以将运行结果保存在文件中
	public static void main(String[] args){
		hanoi(3,0,2);//3个盘子，  3个柱子0,1,2   从0最终移动到2
	}
	
	public static void hanoi(int n,int from,int to){
		if (n==1){
			System.out.printf("从%d移动到%d%n",from,to);
		}
		else {
			int other=3-from-to;
			hanoi(n-1,from,other);
			System.out.printf("从%d移动到%d%n",from,to);
			hanoi(n-1,other,to);
		}
			
	}
	
	//=====================================
	//青蛙跳台阶问题  ——-是一个斐波那锲数的变形
	//用逆推的思想解决  不要过早的做递归展开
	
	
}
			
	