import java.util.Scanner;
public class MyTime{
	//属性
	private int hour;
	private int minute;
	private int seconde;
	private boolean b24 = false;
	
	//构造方法
	public MyTime(int hour, int minute,int seconde){
		if (hour<0||hour>23){
			return;
		}
		if (minute<0||minute>59){
			return;
		}
		if (seconde<0||seconde>59){
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.seconde=seconde;
	}
	
	// 方法
	// setter
	public void setB24() {
		b24 = true;
	}
	
	public void setB12() {
		b24 = false;
	}
	
	//增加多少秒
	public void add(int seconds) {
		seconde += seconds;
		while (seconde >= 60) {
			seconde -= 60;
			minute += 1;
			if (minute >= 60) {
				minute -= 60;
				hour += 1;
				if (hour >= 24) {
					hour -= 24;
				}
			}
		}
	}
	
	//减少多少秒
	public void sub(int seconds) {
		seconde -= seconds;
		while (seconde < 0) {
			seconde += 60;
			minute -= 1;
			if (minute < 0) {
				minute += 60;
				hour -= 1;
				if (hour < 0) {
					hour = 23;
				}
			}
		}
	}
	
	//覆盖
	@Override
	public String toString() {
		//24小时制
		if (b24) {
			return String.format("%02d:%02d:%02d", hour, minute, seconde);
		} else {   //12小时制
			// 00:38:49		=>	AM 12:38:49
			// 12:38:49		=>	PM 12:38:49
			String amOrPm = "AM";
			if (hour >= 12) {
				amOrPm = "PM";
			}
			
			int h = hour;
			if (h == 0) {
				h = 12;
			} else if (h > 12) {
				h -= 12;
			}
			//时 分 秒   （%02d:）代表输出格式为两位数，若是1位数则前面补零  比如：08：
			return String.format("%s %02d:%02d:%02d", amOrPm, h, minute, seconde);
		}
	}
	
	
	//主	
	public static void main(String[] args) {
		/*
		//给出不同的边界数据进行测试
		MyTime t1 = new MyTime(0, 0, 0);
		MyTime t2 = new MyTime(12, 0, 0);
		MyTime t3 = new MyTime(11, 0, 0);
		MyTime t4 = new MyTime(23, 0, 0);
		MyTime t5 = new MyTime(13, 0, 0);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
		t1.add(1000);
		
		System.out.println(t1);
		
		t1.sub(500);
		
		System.out.println(t1);
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请按照 24 小时制输入");
		System.out.println("请输入时:");
		int hour = scanner.nextInt();
		System.out.println("请输入分:");
		int minute = scanner.nextInt();
		System.out.println("请输入秒:");
		int seconde = scanner.nextInt();
		MyTime t = new MyTime(hour, minute, seconde);
		
		while (true) {
			System.out.println("12 还是 24");
			int select = scanner.nextInt();
			if (select == 1) {
				t.setB12();
			} else {
				t.setB24();
			}
		
			System.out.println("加 还是 减");
			select = scanner.nextInt();
			System.out.println("秒数");
			int seconds = scanner.nextInt();
			if (select == 1) {
				t.add(seconds);
			} else {
				t.sub(seconds);
			}
			System.out.println(t);
		}
	}
}
