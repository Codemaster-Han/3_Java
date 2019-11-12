public class Person {
	int age;
	static int number = 0;	// 统计对象被构造了多少次
	
	public Person(int age) {
		this.age = age;
		Person.number++;
	}
	
	public int getAge() {
		System.out.println(this.age);
		return age;
	}
	
	public static int getNumber() {
		// 错误: 无法从静态上下文中引用非静态 变量 this
		//System.out.println(this.age);
		//System.out.println(age);
		//System.out.println(this.getAge());
		//System.out.println(getAge());
		return Person.number;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person(18);
		Person p2 = new Person(22);
		Person p3 = new Person(28);
		Person p4 = new Person(30);
		
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
		System.out.println(p3.getAge());
		System.out.println(p4.getAge());
		
		System.out.println(Person.getNumber());
	}
}



