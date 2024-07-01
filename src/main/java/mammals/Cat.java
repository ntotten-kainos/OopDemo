package main.java.mammals;

public class Cat extends Animal {

    public Cat(int age, String name, float weight) {
        super(age, name, weight);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "animals.Cat {" +
                "age = " + getAge() + " years" +
                ", weight = " + getWeight() + " lbs" +
                ", name = '" + getName() + '\'' +
                ", paid = " + getPaid() +
                '}';
    }
}
