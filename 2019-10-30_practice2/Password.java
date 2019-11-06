import java.util.Scanner ;
public class Password{
	public static void main (String[] args){
		int password=123456;
		for(int i=1;i<=3;i++){
		System.out.println("请用户输入6位密码：>");
		Scanner code=new Scanner(System.in);
		int user=code.nextInt();
		if (password==user){
			System.out.println("恭喜你，登录成功");
			break;
		 }
		 else  if(i!=3)
			 System.out.println("密码错误，请重新输入密码");
		 else
		     System.out.println("很遗憾，三次输入密码错误，登录失败");
		}
	 }
	}
	
	//编写代码模拟三次密码输入；
	//最多能输入3次，密码正确，提醒“登录成功”  密码错误，可以重新输入，如果三次都不正确，则提示退出程序