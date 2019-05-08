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
        System.out.println("Введите текст со словом бяка");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
// первым if валидируем с разными окончаниями (английский и русский языки)
        if (s.contains("бяка") & s.contains("бяka")) {
            String s2 = s.replaceAll("бяка", " «вырезано цензурой» ");
            String s3 = s2.replaceAll("бяka", " «вырезано цензурой» ");
            System.out.println(s3);
            //последующие проверки. одинарные
        } else if (s.contains("бяка")) {
            String s2 = s.replaceAll("бяка", " «вырезано цензурой» ");
            System.out.println(s2);
        } else if (s.contains("бяka")) {
            String s3 = s.replaceAll("бяka", " «вырезано цензурой» ");
            System.out.println(s3);
        } else {
            System.out.println("Нету бяки");


            //skvmsdkvm skmckm smбяка дульмллмьбяka
        }
    }
}
