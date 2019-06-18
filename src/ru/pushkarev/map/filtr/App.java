package ru.pushkarev.map.filtr;

import java.util.Map;

/**
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

public class App {
    public static void main(String[] args) {
        App app = new App ( );
        app.runFiltr ( );
    }

    private void runFiltr() {

        FiltrMap filtrMap = new FiltrMap ( );
        filtrMap.addPerson ("Вася", "Иванов");
        filtrMap.addPerson ("ВаAся", "Иванов1");
        filtrMap.addPerson ("ВасAaя", "Иванов2");
        filtrMap.addPerson ("Василий", "Иванов3");

        filtrMap.printMap ( );
        System.out.println (filtrMap.isUnique ( ));

        filtrMap.addPerson ("Васa", "Иванов");
        filtrMap.addPerson ("Василий", "Иванов");
        System.out.println (filtrMap.isUnique ( ));

    }
}
