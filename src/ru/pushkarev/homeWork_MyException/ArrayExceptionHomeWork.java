package ru.pushkarev.homeWork_MyException;

import java.util.Scanner;

public class ArrayExceptionHomeWork {

    public static void main(String[] args) {

        try {
            printValue();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого числа нет в массиве");
        }
    }

    public static void printValue() {

        Scanner scanner = new Scanner(System.in);
        int[] integer = new int[10];

        for (int i = 0; i < integer.length; i++) {
            integer[i] = (int) (Math.random() * 100);
            System.out.print(integer[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Введите индекс числа, которое хотите вывести на экран.");
        int q = scanner.nextInt() - 1;
        System.out.println(integer[q]);

    }
}

