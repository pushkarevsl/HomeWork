package ru.pushkarev.homeWork_31_05_Arrays;

/**
 * Дан двумерный массив. Задача – написать метод
 * <p>
 * public void toLeft() {}
 * <p>
 * 1.Пройти с 1-ой до последней строки
 * 2.Пройти с 1-го до предпоследнего элемента
 * 3.В текущую ячейку поместить значение следующей
 * 4.Последнему элементу присвоить 0
 * Так выглядит любая строка после преобразования данным методом
 * <p>
 * 2 3 4 5 6 7 8 9 0
 */

public class taskFirst {

    static int[][] array = new int[3][10];

    public static void main(String[] args) {

        createArray ( );
        //printArray ( );
        swap ( );

    }

    private static void swap() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = array[i][i];
                array[i][j] = array[i][j + 1];
                array[i][j + 1] = temp;
            }
        }
        printArray ( );
    }

    private static void createArray() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
            }
        }
    }

    private static void printArray() {
        for (int[] arrays : array) {
            for (int arr : arrays) {
                System.out.print (arr + " ");
            }
            System.out.println ( );
        }
        System.out.println ("====================");
    }


}
