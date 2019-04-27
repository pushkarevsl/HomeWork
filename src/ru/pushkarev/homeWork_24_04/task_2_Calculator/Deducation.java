package ru.pushkarev.homeWork_24_04.task_2_Calculator;

public class Deducation extends Main {

    static void deducation(int x, double y) {
        System.out.println("Результат вычисления разницы " + (x - y));
    }


    public Deducation(int x, double y) {
        super(y);
    }
}
