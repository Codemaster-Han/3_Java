public class 初始化类的两种形式 {
    static {
        System.out.println(1000);
    }

    // 1. 定义时初始化
    static int a = initA();

    // 2. 静态代码块初始化(允许多个)
    static {
        System.out.println(10);
    }

    static int initA() {
        System.out.println(0);
        return 0;
    }

    public static void main(String[] args) {
        new 初始化类的两种形式();
        new 初始化类的两种形式();
    }
}

//运行结果如下：
//1000
//0
//10