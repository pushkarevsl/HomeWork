package ru.pushkarev.homeWork_24_04_Lection_8.task_2_Calculator;

public class Division extends Main {

    public Division(int x) {
        super(x);
    }

    public Division(int x, double y) {
        super(y);
    }

    static void division(int x, double y) {
        System.out.println("Результат деления " + x / y);
    }


}
