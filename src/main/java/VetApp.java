package main.java;

import main.java.mammals.Human;
import main.java.sorting.SortByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class VetApp {
    public static void main(String[] args) {
        List<Human> people = getHumans();

        System.out.println("\nYoungest person: ");
        System.out.println(people.stream().min(new SortByAge()).get().getName());

        System.out.println("\nOldest person: ");
        System.out.println(people.stream().max(new SortByAge()).get().getName());

        double avgAge;

        avgAge = people.stream()
                        .mapToInt(Human::getAge)
                        .average().orElse(0);


        System.out.println("\nAverage age: " + avgAge);

        System.out.println("\nList of humans over 30: ");
        people.stream()
            .filter(Human -> Human.getAge() > 30)
            .forEach(Human -> System.out.println("-> Name: " + Human.getName()));

        System.out.println("\nList of humans 30 or under: ");
        people.stream()
                .filter(Human -> Human.getAge() <= 30)
                .forEach(Human -> System.out.println("-> Name: " + Human.getName()));

        System.out.println("\nNames in alphabetical order:");
        people.stream()
                .sorted()
                .forEach(Human -> System.out.println("Name: " + Human.getName()));

        System.out.println("\nNames in order of age:");
        people.stream()
                .sorted(new SortByAge())
                .forEach(Human -> System.out.println("Name: " + Human.getName() + "  \tAge: " + Human.getAge()));
    }

    private static List<Human> getHumans() {
        Human John = new Human(45, "John");
        Human Alice = new Human(25, "Alice");
        Human Bob = new Human(97, "Robert");
        Human Craig = new Human(21, "Craig");
        Human Jeremy = new Human(56, "Jeremy");
        Human Nathan = new Human(22, "Nathan");
        Human Harold = new Human(82, "Harold");
        Human Timmy = new Human(12, "Timothy");

        List<Human> people = new ArrayList<>();
        people.add(John);
        people.add(Alice);
        people.add(Bob);
        people.add(Craig);
        people.add(Jeremy);
        people.add(Nathan);
        people.add(Harold);
        people.add(Timmy);
        return people;
    }
}
