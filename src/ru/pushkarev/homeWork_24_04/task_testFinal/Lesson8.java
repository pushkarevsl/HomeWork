package ru.pushkarev.homeWork_24_04.task_testFinal;


/**
 * Поэкспериментировал с final
 */


public class Lesson8 {

    private static final double PI = 3.14;
    public static final String TEXT = "Hello!";

    public static void main(String[] args) {
        System.out.println(PI);
    }

    public void test() {
        System.out.println("Привет!");
    }
}
