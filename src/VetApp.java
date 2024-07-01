import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VetApp {
    public static void main(String[] args) {
        List<Human> people = getHumans();


        int ageTotal = 0;

        ageTotal = people.stream()
                        .map(Human -> Human.getAge())
                        .mapToInt(Integer::intValue)
                        .sum();

        int avgAge = ageTotal / people.size();

        System.out.println("Average age: " + avgAge);

        System.out.println("List of humans over 30: ");
        people.stream()
            .filter(Human -> Human.getAge() > 30)
            .forEach(Human -> System.out.println("-> " + Human.getName()));
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
