package ru.pushkarev.homeWork_4_15_04;

/*

Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое),
чётное или нечётное.

*/

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Число равно нулю");
        } else if (number > 0 && number % 2 == 0) {
            System.out.println("Число положительное, четное");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Число положительное, нечетное");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("Число отрицательное, четное");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("Число отрицательное, нечетное");
        }
        scanner.close();
    }
}
