package ru.pushkarev.homeWork_24_04.task_2_Calculator;

public class Procent extends Main {
    static void procent(int x, double y) {
        System.out.println("Результат вычисления " + y + " процентов, от числа " + x + " равен " + (x / 100) * y);
    }

    public Procent(int x) {
        super(x);
    }

    public Procent(int x, double y) {
        super(y);
    }
}
