import java.util.ArrayList;
import java.util.List;

public class ExceptionPrint {
    public  static  void  method1(){
        try {
            method4();
        }catch (RuntimeException e){
            throw new  MyException("我是异常",e);//注意  注意
        }
    }


    public  static  void  method2(){
        method1();
    }


    public  static  void  method3(){
        method2();
    }


    private static void method4() {
        List<String> list = new ArrayList<String>();
        list.get(0);
    }


    public static void main(String[] args) {
        method3();
    }
}
