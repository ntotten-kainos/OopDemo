package main.java.sorting;

import java.util.Comparator;
import main.java.mammals.Human;

public class SortByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
