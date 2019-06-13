package ru.pushkarev.homeWork_07_06_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ДЗ_24_Фильтрация множества элементов
 * Написать метод, который возвращает множество, в котором удалены все элементы
 * четной длины из исходного множества.
 * <p>
 * public Set<String> removeEvenLength(Set<String> set);
 * <p>
 * Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
 * метод вернет ["foo", "bar", "spoon", "!"]
 */

public class EvenValueSet {

    public static void main(String[] args) {

        EvenValueSet evenValueSet = new EvenValueSet ( );
        evenValueSet.removeEvenLength ( );

    }

    private Set<String> removeEvenLength() {

        Set<String> set = new HashSet<> ( );

        set.add ("foo");
        set.add ("buzz");
        set.add ("bar");
        set.add ("fork");
        set.add ("bort");
        set.add ("spoon");
        set.add ("!");
        set.add ("dude");

        set.removeIf (o -> o.length ( ) % 2 == 0);  // сделал через if, вылез warning когда коммит делал,
        // и идея вывела такой код

        for (String s : set) {
            System.out.println (s);
        }
        return null;
    }
}

