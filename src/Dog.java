public class Dog extends Animal{
    public Dog(int age, String name, float weight) {
        super(age, name, weight);
    }

    @Override
    public String speak() {
        return "Woof";
    }

    @Override
    public String toString() {
        return "Dog {" +
                "age = " + getAge() + " years" +
                ", weight = " + getWeight() + " lbs" +
                ", name = '" + getName() + '\'' +
                ", paid = " + getPaid() +
                '}';
    }
}
