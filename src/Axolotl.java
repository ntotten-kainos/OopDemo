public class Axolotl extends Animal implements ISwim {

    private boolean isSwimming = false;

    public Axolotl(int age, String name, float weight) {
        super(age, name, weight);
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    @Override
    public String speak() {
        return "...";
    }

    @Override
    public String toString() {
        return "Axolotl {" +
                "age = " + getAge() + " years" +
                ", weight = " + getWeight() + " lbs" +
                ", name = '" + getName() + '\'' +
                ", paid = " + getPaid() +
                '}';
    }

    @Override
    public void swim() {
        setSwimming(true);
    }
}
