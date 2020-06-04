import sun.net.spi.nameservice.dns.DNSNameService;

public class PrintClassLoader {
    public static void main(String[] args) {
        // 打印 null，表示是由 BootstrapClassLoader 加载
        // jre1.8.0_141\lib\rt.jar
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);

        // ExtensionClassLoader 加载
        // jre1.8.0_141\lib\ext\*.jar
        ClassLoader classLoader2 = DNSNameService.class.getClassLoader();
        System.out.println(classLoader2.getParent());
        System.out.println(classLoader2);

        // ApplicationClassLoader 加载
        // CLASSPATH 环境变量 或者 java -cp 或者 .
        ClassLoader classLoader3 = PrintClassLoader.class.getClassLoader();
        System.out.println(classLoader3.getParent());
        System.out.println(classLoader3);
    }
}