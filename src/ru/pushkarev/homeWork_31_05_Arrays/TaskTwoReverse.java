package ru.pushkarev.homeWork_31_05_Arrays;

import java.util.Arrays;

/**
 * ДЗ_21_1_2_Реверс массива
 * Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
 * Задачу не зачитывать если использованы утильные методы класса Arrays.
 * Решением также не являются манупуляции с выводом массива.
 * Необходимо действительно перемещать элементы.
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 */

public class TaskTwoReverse {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int[] copyArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            copyArray[array.length - i - 1] = array[i];
        }
        System.out.println (" ");

        System.out.println (Arrays.toString (array));
        System.out.println (Arrays.toString (copyArray));

    }
}
