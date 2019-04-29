package ru.pushkarev.homeWork_24_04_Lection_8.task_2_Calculator;

/**
 * 2. Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
 * сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами,
 * так и с дробями.
 */

public class Main {

    public static void main(String[] args) {

        Deducation.deducation(100, 21);

        Division.division(100, 23.0);

        Multiplication.multiplication(12, 31);

        Procent.procent(1955, 32);

        Summa.sum(12, 32);
    }


}
