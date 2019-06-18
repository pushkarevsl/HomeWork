package ru.pushkarev.map.filtr;

/*
 * 25_ДЗ_1_Фильтр мапы
 * <p>
 * public boolean isUnique(Map<String, String> map);
 * <p>
 * Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
 * <p>
 * Для пустой мапы метод возвращает true.
 * <p>
 * Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
 * <p>
 * а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class FiltrMap {

    private Map<String, String> map = new HashMap<> ( );


    private String getName(String name) {
        for (Map.Entry<String, String> entry : map.entrySet ( )) {
            if (entry.getKey ( ).equals (name)) {
                return name;
            }
        }
        return null;
    }

    void addPerson(String name, String surname) {
        String key = getName (name);
        if (key == null) {
            map.put (name, surname);
        }
    }

    boolean isUnique() {

        return map.values ( ).size ( ) == new HashSet<> (map.values ( )).size ( );
    }

    void printMap() {
        for (Map.Entry<String, String> entry : map.entrySet ( )) {
            System.out.println (entry.getKey ( ) + " = " + entry.getValue ( ));
        }
    }
}
