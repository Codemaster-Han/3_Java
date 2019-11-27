import javax.xml.crypto.dom.DOMCryptoContext;

public class UpperCase {
    public static void main(String[] args) {
        Animal p1 = new Dog("小明");
        Animal p2 = new Pig();
        Animal p3 = new Human();

        /*
        p1.scream();    // 汪汪
        p2.scream();    // 吱吱
        p3.scream();    // 呵呵

        Animal.sleep();
        Dog.sleep();
        Human.sleep();

        Animal.sleep();
        Animal.sleep();
        Animal.sleep();
        */

        ((Human)p3).scream("我");
        //((Human)p1).scream("我");
    }
}
