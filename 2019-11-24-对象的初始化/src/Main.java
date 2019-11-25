public class Main {
    public static void main(String[] args) {
        System.out.println(6);
        new 练习();
        new 练习();
        System.out.println(7);
    }
}

//运行结果如下：
//6
//5-------------------静态初始化  定义时
//4------------------静态代码块
//0------------普通初始化   定义时
//2-----------普通代码块
//3----------普通代码块
//1-----构造方法
//0
//2
//3
//1
//7