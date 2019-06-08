package ru.pushkarev.comparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать класс PersonSuperComparator,
 * <p>
 * который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
 * <p>
 * Класс Person теперь содержит два поля int age и String name
 */

public class App {

    public static void main(String[] args) {

        List<Person> person = new ArrayList<> ( );

        person.add (new Person ("Vasia", 12));
        person.add (new Person ("Sema", 7));

    }



}
