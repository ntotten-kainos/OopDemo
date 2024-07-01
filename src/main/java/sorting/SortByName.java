package main.java.sorting;

import main.java.mammals.Human;

import java.util.Comparator;

public class SortByName implements Comparator<Human>
{
    @Override
    public int compare(Human o1, Human o2) {
        return CharSequence.compare(o1.getName(), o2.getName());
    }
}
