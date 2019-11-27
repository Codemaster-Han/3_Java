package upper_case_scene;

public class Cat extends Animal {
    @Override
    public int getNumberOfLegs() {
        return 3;
    }

    @Override
    public String getType() {
        return "猫";
    }

    @Override
    public String scream() {
        return "喵喵";
    }
}
