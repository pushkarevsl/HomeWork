package ru.pushkarev.comparator;

import java.util.*;

/**
 * Написать класс PersonNameComparator,
 * <p>
 * который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
 * <p>
 * Класс Person теперь содержит два поля int age и String name
 */

public class App {
    private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        List<Person> person = new ArrayList<> ( );

        person.add (new Person ("Вася", 12));
        person.add (new Person ("Сёма", 7));
        person.add (new Person ("Пушок", 4));
        person.add (new Person ("Пеструшка", 10));
        person.add (new Person ("Вася", 10));

        System.out.println ("Введи age для сортировки по возрасту, name по имени");
        switch (sc.nextLine ( )) {
            case "age":
                person.sort (new PersonAgeComparator ( ));
                System.out.println (person);
                break;
            case "name":
                person.sort (new PersonNameComparator ( ));
                System.out.println (person);
                break;


        }

    }
}
