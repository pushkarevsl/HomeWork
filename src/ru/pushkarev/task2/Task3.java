package ru.pushkarev.task2;

//программу, которая конвертирует секунды в часы. Пример: на вход подается 3600, на выходе печатается 1 час.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интересуемое количество секунд, для преобразования в часы");
        int seconds = scanner.nextInt();
        double hour = (double) seconds / 3600;
        System.out.println(seconds + " секунд составляют " + hour + " час(а)");
    }
}
