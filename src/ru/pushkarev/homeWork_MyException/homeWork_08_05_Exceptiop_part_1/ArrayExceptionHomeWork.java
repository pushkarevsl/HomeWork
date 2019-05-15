package ru.pushkarev.homeWork_MyException.homeWork_08_05_Exceptiop_part_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionHomeWork {

    public static void main(String[] args) {

        try {
            printValue();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого числа нет в массиве");
        } catch (InputMismatchException e) {
            System.out.println("Введите число, а не строку!");
        }
    }

    public static void printValue() {

        Scanner scanner = new Scanner(System.in);
        int[] integer = new int[5];

        System.out.println("Введите числа, которое хотите вывести массив.");

        for (int i = 0; i < integer.length; i++) {
            integer[i] = scanner.nextInt();
        }
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Введите индекс числа, которое хотите вывести на экран.");

        int q = scanner.nextInt() - 1;
        System.out.println(integer[q]);

    }
}

