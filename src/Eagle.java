public class Eagle extends Animal implements IFly {

    public boolean isSoaring() {
        return isSoaring;
    }

    public void setSoaring(boolean soaring) {
        isSoaring = soaring;
    }

    private boolean isSoaring = false;

    public Eagle(int age, String name, float weight) {
        super(age, name, weight);
    }

    @Override
    public String speak() {
        return "Screech";
    }

    @Override
    public void fly() {
        setSoaring(true);
    }

    @Override
    public String toString() {
        return "Eagle {" +
                "age = " + getAge() + " years" +
                ", weight = " + getWeight() + " lbs" +
                ", name = '" + getName() + '\'' +
                ", paid = " + getPaid() +
                '}';
    }
}
