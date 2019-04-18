package ru.pushkarev.homeWork_4_15_04;

        /*
        Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
        */

public class Task_4_4 {
    public static void main(String[] args) {
        int firstElement = 1;
        int delta = 2;
        int quantity = 10;
        int arArifmetProgressia[] = new int[quantity];
        int arGeometrProgressia[] = new int[quantity];

        for (int i = 1; i <= quantity; i++) {
            arArifmetProgressia[i - 1] = firstElement + (i - 1) * delta;
            System.out.print(arArifmetProgressia[i - 1] + " ");
        }
        System.out.println(" ");

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
