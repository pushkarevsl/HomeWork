package ru.pushkarev.homeWork_4_15_04;

/*
        Написать программу для поиска минимального из двух чисел.
*/

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число для сравнения");
        int first = scanner.nextInt();
        System.out.println("Введите второе число для сравнения");
        int second = scanner.nextInt();
        if (first > second) {
            System.out.println("Второе число меньше первого");
        } else {
            System.out.println("Первое число меньше второго");
        }

    }
}
