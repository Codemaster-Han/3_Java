import java.util.Scanner;

public class StudentUser extends User {
    @Override
    public void menu() {
        System.out.println("1. 借书");
        System.out.println("2. 还书");
    }

    @Override
    public void operation(int select) {
        switch (select) {
            case 1:
                borrowBook();
                break;
            case 2:
                returnBook();
                break;
        }
    }

    //还书
    private void returnBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书名：");
        String title = scanner.nextLine();

        BookShelf bookShelf = BookShelf.getBookShelf();
        bookShelf.add(book);
        System.out.println("还书成功");
    }

    //借书
    private void borrowBook() {
    }
}