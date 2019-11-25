public class 初始化对象的三种形式 {
    // 3. 构造方法中初始化
    初始化对象的三种形式() {
        this(0);
        System.out.println(100);
    }

    初始化对象的三种形式(int v) {
        System.out.println(10000);
    }


    // 2. 代码块初始化(允许多个)
    {
        System.out.println(1000);
    }

    // 1. 定义时初始化
    private int a = initA();

    //代码块初始化
    {
        System.out.println(10);
    }

    //普通方法
    private int initA() {
        System.out.println(0);
        return 0;
    }

    public static void main(String[] args) {
        new 初始化对象的三种形式();
    }
}


//运行结果如下：
//1000----------代码块初始化 和定义时初始化    按照顺序从上往下执行
//0
//10
//10000---------------构造方法代码块最后执行，若有多个构造方法，则按照顺序从上往下执行，但是无参数的构造方法最后执行
//100