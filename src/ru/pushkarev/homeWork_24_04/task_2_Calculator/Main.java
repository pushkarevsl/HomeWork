package ru.pushkarev.homeWork_24_04.task_2_Calculator;

/**
 * 2. Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
 * сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами,
 * так и с дробями.
 */

public class Main {

    private static int x;

    private static double y;

    public static void main(String[] args) {

        Summa su = new Summa(100, 10.1);//сумма
        su.sum(100, 100.1);

        Deducation ded = new Deducation(100, 10.1); // разница
        ded.deducation(123, 23.2);

        Multiplication mult = new Multiplication(193, 23); //умножение
        mult.multiplication(120, 20.1);

        Division div = new Division(100, 20);
        div.division(100, 20);

        Procent proc = new Procent(190, 23.3);
        proc.procent(100, 23.2);


    }


    public Main(int x) {
        this.x = x;
    }

    public Main(double y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
