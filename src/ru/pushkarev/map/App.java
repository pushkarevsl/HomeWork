package ru.pushkarev.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 29. Хешмап
 * - Создать хешмап для класса Person (поля - возраст , фамилия,  пол)
 * переопределить equals(), hashСode(), toString() для объектов класса Person.
 * <p>
 * - Добавить в мапу элементы так, что внутри мапы с разными ключами окажутся одинаковые Person
 * <p>
 * - Реализовать метод removeTheDuplicates по поиску дубликатов в исходной мапе, затем при нахождении дубликата
 * удалить его из исходной мапы используя метод
 * removeItemFromMapByValue(Map<String, Person> map, Person value)
 * <p>
 * Вывести содержимое мапы в консоль.
 */

public class App {

    public static void main(String[] args) {

        removeTheDuplicates (createMap ( ));

    }

    private static Map<String, Person> createMap() {

        Map<String, Person> book = new HashMap<> ( );

        Person person1 = new Person (29, "Петрова", "жен");
        Person person2 = new Person (34, "Сидорова", "жен");
        Person person3 = new Person (34, "Тихонова", "жен");
        Person person4 = new Person (35, "Иванов", "муж");
        book.put ("Key1", person1);
        book.put ("Key2", person2);
        book.put ("Key3", person1);
        book.put ("Key4", person3);
        book.put ("Key5", person1);
        book.put ("Key6", person4);

        return book;
    }

    private static void removeTheDuplicates(Map<String, Person> map) {

        Map<String, Person> copyBook = new HashMap<> (map); // делаю копию карты
        for (Map.Entry<String, Person> copyEntry : copyBook.entrySet ( )) {
            Person person = copyEntry.getValue ( ); // создал переменную типа персон, с ней буду сравнивать значения
            int count = 0;
            for (Map.Entry<String, Person> entry : map.entrySet ( )) {
                if (person.equals (entry.getValue ( ))) {
                    count++;
                }
                if (count > 2) {
                    removeItemFromMapByValue (map, person);
                }
            }
        }
        for (Map.Entry<String, Person> entry : map.entrySet ( )) {
            System.out.println (entry.getKey ( ) + " : " + entry.getValue ( ));
        }
    }

    private static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<> (map);
        for (Map.Entry<String, Person> pair : copy.entrySet ( )) {
            if (pair.getValue ( ).equals (value)) {
                map.remove (pair.getKey ( ));
            }
        }
    }
}
