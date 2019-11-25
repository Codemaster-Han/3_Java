public class 练习 {

    int initB() {
        System.out.println(0);
        return 0;
    }

    练习() {
        System.out.println(1);
    }

    //普通初始化
    int b = initB();

    {
        System.out.println(2);
    }

    //静态初始化
    static int a = initA();

    {
        System.out.println(3);
    }

    static {
        System.out.println(4);
    }

    static int initA() {
        System.out.println(5);
        return 0;
    }
}
