public class BookDemo {
	public static void main(String[] args) {
		Book book1 = new Book(
			"钢铁是怎么炼成的", "奥斯特洛夫斯基",
			100, "商务出版社"
		);
		
		Book book2 = new Book(
			"三体 I", "刘慈欣",
			50, "北京工业出版社"
		);
		
		System.out.println(book1);
		System.out.println(book1.getDiscount(0.5));
		System.out.println(book2);
		System.out.println(book2.getDiscount(2));
	}
}