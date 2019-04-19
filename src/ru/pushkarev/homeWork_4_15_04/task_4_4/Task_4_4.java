package ru.pushkarev.homeWork_4_15_04.task_4_4;

import java.util.Scanner;

public class Task_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый элемент ппрогрессии!");
        int firstElement = sc.nextInt();
        System.out.println("Введите шаг прогрессии.");
        int delta = sc.nextInt();
        System.out.println("Введите количество элементов прогрессии.");
        int quantity = sc.nextInt();

        int arArifmetProgressia[] = new int[quantity];
        for (int i = 1; i <= quantity; i++) {
            arArifmetProgressia[i - 1] = firstElement + (i - 1) * delta;
            System.out.println("arArifmetProgressia[" + (i) + "] = " + arArifmetProgressia[i - 1] + " ");
        }

        System.out.println("- - -");

        int arGeometrProgressia[] = new int[quantity];

        for (int i = 1; i < quantity; i++) {
            arGeometrProgressia[0] = firstElement;
            arGeometrProgressia[i] = arGeometrProgressia[i - 1] * delta;
        }
        //  для чего дополнительный цикл? Если проще то убрал заморочку с выводом первого( нулевого) элемента
        for (int i = 0; i < quantity; i++) {
            System.out.println("arGeometrProgressia[" + (i + 1) + "] = " + arGeometrProgressia[i] + " ");
        }

    }
}
