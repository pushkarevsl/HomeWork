package ru.pushkarev.homeWork_31_05_Arrays;

public class Expirience {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println ("сдвиг");

        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }


        array[array.length - 1] = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] + " ");
        }
    }
}
