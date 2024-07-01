package main.java.mammals;

import main.java.interfaces.IFly;
import main.java.interfaces.ISwim;

public class Goose extends Animal implements IFly, ISwim {

    private boolean isFlying = false;
    private boolean isSwimming = false;

    @Override
    public String toString() {
        return "animals.Goose {" +
                "age = " + getAge() + " years" +
                ", weight = " + getWeight() + " lbs" +
                ", name = '" + getName() + '\'' +
                ", paid = " + getPaid() +
                '}';
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public Goose(int age, String name, float weight) {
        super(age, name, weight);
    }

    @Override
    public void fly(){
        this.setFlying(true);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public String speak() {
        return "HONK";
    }

    @Override
    public void swim() {
        setSwimming(true);
    }
}
