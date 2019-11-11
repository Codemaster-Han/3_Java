public class BicycleDemo{
	public static void main(String[] args){
		Bicycle bicycle=new Bicycle();
		System.out.println("刚初始化：");
		System.out.println(bicycle.getColour());
		System.out.println(bicycle.getSpeed());
		
		bicycle.setColour("粉红色");
		System.out.println("涂完漆后：");
		System.out.println(bicycle.getColour());
		
		System.out.println("下坡加速->");
		for (int i = 0; i < 22; i++) {
			bicycle.riseSpeed();
			System.out.println(bicycle.getSpeed());
		}
		
		System.out.println("上坡减速->");
		for (int i = 0; i < 22; i++) {
			bicycle.declineSpees();
			System.out.println(bicycle.getSpeed());
		}	
	}
}