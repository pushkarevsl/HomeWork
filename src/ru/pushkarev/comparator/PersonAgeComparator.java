package ru.pushkarev.comparator;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return Integer.compare (a.getAge ( ), b.getAge ( ));
    }
}
