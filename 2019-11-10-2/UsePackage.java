import creationPackage.tangzhong.Phone;

public class UsePackage {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "华为";
		p.colour = "红色";
		p.price = 1000;
		
		System.out.println(p.brand);
	}
}
