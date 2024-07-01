public class Human implements IPay, Comparable<Human> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    private String name;
    private int age;
    private boolean isPaid;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Human {" +
                "name = '" + getName() + '\'' +
                ", age = " + getAge() +
                ", isPaid = " + isPaid() +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        return CharSequence.compare(this.getName(), o.getName());
    }
}
