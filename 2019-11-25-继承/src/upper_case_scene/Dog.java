package upper_case_scene;

public class Dog extends Animal {
    @Override
    public int getNumberOfLegs() {
        return super.getNumberOfLegs() + 2;
    }

    @Override
    public String getType() {
        return "狗";
    }

    @Override
    public String scream() {
        return "汪汪";
    }
}
