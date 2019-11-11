public class Book{
	//属性
	private String bookName;
	private String writer;
	private double price;
	private String publish;
	
	//构造方法  将所有的属性都初始化一编
	Book(String bookName,String writer,double price,String publish){
		this.bookName=bookName; //加上this.  区分两个bookName
		this.writer=writer;
		this.price=price;
		this.publish=publish;
	}
	
	//方法
    // getter  读取并返回
	String getBookName() {
		return bookName;
	}
	
	String getWriter() {
		return writer;
	}
	
	double getPrice() {
		return price;
	}
	
	String getPublish() {
		return publish;
	}
	
	// setter->书名和作者
	void setTitle(String bookName) {
		this.bookName = bookName;
	}
	
	void setAuthor(String writer) {
		this.writer = writer;
	}
	
	// 普通方法->加上一个作者+打折情况
	void appendAuthor(String writer) {
		this.writer = this.writer + " " + writer;
	}
	
	double getDiscount(double discount) {
		return this.price * discount;
	}
	
	// 覆写一个方法
	@Override
	public String toString() {
		return String.format("《%s》by %s", bookName, writer);
	}
}







