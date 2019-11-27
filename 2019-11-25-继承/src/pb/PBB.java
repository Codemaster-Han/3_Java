package pb;

import pa.PAA;//导入pa包里面的PA类

public class PBB extends PAA {
    void method() {
        System.out.println(protectedF);
        System.out.println(publicF);
    }

    public static void main(String[] args) {
        PAA i = new PAA();
        System.out.println(i.publicF);
    }
}
