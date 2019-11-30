public class WrapClassDemo {
    public static void main(String[] args) {
        Integer iobj = Integer.valueOf(10);  //手动装箱
        int i = iobj.intValue(); //手动拆箱

        Integer iobj2 = 20;  //自动装箱
        int i2 = iobj2;  //自动拆箱

        Integer iobj3 = (Integer) 30;  //自动装箱
        int i3 = (int) iobj3;  //自动拆箱
    }
}
