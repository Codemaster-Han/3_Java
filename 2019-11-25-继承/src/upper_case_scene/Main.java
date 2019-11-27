package upper_case_scene;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

//继承的好处，不用重复编写
public class Main {
    public void brief(Animal a) {
        System.out.println("我是 " + a.getType());
        System.out.println("我叫 " + a.scream());
        System.out.println("我有 " + a.getNumberOfLegs() + " 条腿");
    }

    public Animal createAnimal() {
        return new Animal();
    }

    public Animal createDog() {
        return new Dog();
    }

    public Animal createCat() {
        return new Cat();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.brief(main.createAnimal());
        System.out.println("======================");
        main.brief(main.createCat());
        System.out.println("======================");
        main.brief(main.createDog());
    }
}
