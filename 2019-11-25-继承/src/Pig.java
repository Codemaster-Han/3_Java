public class Pig extends Animal {
    String house = "主卧";

    Pig() {
        super();
    }

    public void scream(String target) {
        System.out.println("哼哼 to " + target);
    }

    public static void main(String[] args) {
        Pig p = new Pig();
        p.scream("我");
        p.scream();
    }
}
