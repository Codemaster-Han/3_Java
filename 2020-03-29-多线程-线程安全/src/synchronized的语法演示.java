public class synchronized的语法演示 {
    public  synchronized  static  void t1(){

    }
    public  synchronized  void t2(){

    }

    public static void main(String[] args) {
        Object o=new Object();
        synchronized (o){
            System.out.println("安全锁");
        }
    }
}
