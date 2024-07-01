package main.java.mammals;

import main.java.interfaces.IPay;

public abstract class Animal implements IPay {
    private int age;
    private float weight;
    private String name;
    private boolean paid = false;

    public Animal(int age, String name, float weight) {
        this.setAge(age);
        this.setName(name);
        this.setWeight(weight);
    }

    public abstract String speak();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean isPaid) {
        this.paid = isPaid;
    }
}
