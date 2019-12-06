import java.net.PortUnreachableException;
import java.util.Objects;

public class Book implements  Comparable<Book> {
    public  String ISBN;//书的唯一识别码
    public  String title;
    public  String author;
    public  int prince;

    public Book(){
    }

    public static void main(String[] args) {
        Book book1=new Book( );
        Book book2=new Book( );

        book1.title="你好，旧时光";
        book1.author="饶雪漫";
        book1.ISBN="1199002";
        book1.prince=200;


        book2.title="你好，旧时光";
        book2.author="饶雪漫";
        book2.ISBN="1199002";
        book2.prince=200;
        System.out.println(book1.equals(book2));
        System.out.println(book1.compareTo(book2));

    }

    @Override      //方法重写
    public  boolean equals(Object obj){
        //判空
        if(obj==null){
            return  false;
        }

        //判断是不是Book类型的
        if(!(obj instanceof  Book)){
            return  false;
        }

        //向下转型
        Book book=(Book)obj;

        //返回识别码是否相等
        return  this.ISBN.equals(book.ISBN);
    }

    @Override    //方法重写
    public  int compareTo(Book  A){
        //返回值为 0  表示两个价格相等       1  表示this的价格大    -1  表示A的价格大
        return  this.prince-A.prince;
    }


}
