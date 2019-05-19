package ru.pushkarev.homeWork_MyException.homeWork_08_05_Exceptiop_part_1;

import java.util.Scanner;


/**
 * Не присвоено значение первому элементу массива. Если он нам потребуется и мы захотим его взять, то вылетит
 * NullPointerException(). Если вводим число превышающее, количество элементов в массиве, то вылетает
 * ArrayIndexOutOfBoundsException
 */
public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер, индекс элемента ячейки массива.");
        int number = scanner.nextInt();

        Integer[] integers = new Integer[2];
        integers[0] = 1;

        try {
            System.out.println(integers[number]);
            if (integers[1] == null) {
                throw new NullPointerException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошел вызов элемента, за границами массива. " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Не задано значение одного из элементов" + " " + e.getMessage());
        }

    }
}
