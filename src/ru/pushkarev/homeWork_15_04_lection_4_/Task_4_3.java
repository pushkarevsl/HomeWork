package ru.pushkarev.homeWork_15_04_lection_4_;

//таблица умножения

public class Task_4_3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}