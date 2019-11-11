class Person{
	//属性
	String name;
	int age;
	String sex;
	
	//方法（普通方法）
	public void sayHello(String target){
		System.out.println(age+"岁的"+name+"say hello to"+target);
	};
}

//一个文件中可以有多个类，但只能有一个public class，且后面的类名称必须和文件名相同
public class Main{
	public  static void main(String[] args){
		Person p=new Person();
		p.name="小茗同学";
		p.age=23;
		p.sayHello("小韩");
	}
}