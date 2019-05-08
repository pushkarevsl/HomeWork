package ru.pushkarev.string;

import java.util.Scanner;


/**
 * Напишите программу которая получает на вход некую строку , после она вызывает метод,
 * заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой» и выводит результат в консоль!
 * <p>
 * Что хочу сделать. Хочу усложнить!
 * 1. Ввод с помощью сканера, какого то текста, с условием ввода бяки.
 * 2. Метод валидация, поиск конкретного слова.
 * 3. Замена бяки на «вырезано цензурой».
 */


public class AppString {

    public static void main(String[] args) {

        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        String s2 = s.replaceAll("бяка", " «вырезано цензурой» ");

        System.out.println(s2);


// kacklakc бяка воттстс бяка


    }
}
