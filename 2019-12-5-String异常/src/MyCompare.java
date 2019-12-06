import java.util.Comparator;
import java.util.Scanner;


class  TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}

class  AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}

public class MyCompare {
    public static void main(String[] args) {
        System.out.println("请输入想要比较的内容：-》");
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();

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

        if (line.equalsIgnoreCase("价格")){
            //按照价格比较
            int r=book1.compareTo(book2);
        }else  if (line.equalsIgnoreCase("书名")){
            Comparator<Book> c=new TitleComparator();
            int r=book1.compareTo(book2);
        }else if (line.equalsIgnoreCase("作者")){
            Comparator<Book> c=new AuthorComparator();
            int r=book1.compareTo(book2);
        }
    }

}

