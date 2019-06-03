package ru.pushkarev.homeWork_27_05_Bild;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * ДЗ 19. Кассовый чек
 * <p>
 * Дан текстовый файл определенной структуры, в котором содержится информация о покупках.
 * Формат файла:
 * <p>
 * Название товара
 * количество
 * цена
 * <p>
 * Необходимо написать программу, которая выведет на экран чек, сформированный из этого файла.
 * В чеке должна быть информация: название товара:  цена Х кол-во = стоимость
 * В конце отчета вывести итоговую стоимость.
 * Пример входного файла и вывода прикрепляю к задаче
 * out.txt
 * products.txt
 */

/**
 * Решение. Что хочу сделать.
 * 1й этап.
 * - Объявляю два массива.
 * Один String - сюда считывать будем названия.
 * И один double, для цены за товар и количества.
 * - В цикле while со сканером считываем значения из файла.
 * если строка то заносим в массив строк
 * иначе, то заносим в массив double
 * 2й этап.
 * Все данные спарсили. выводим в чек
 */

public class Main {

    public static void main(String[] args) {
        String[] title = new String[50];
        Double[] price = new Double[50];

        System.out.printf("%-20s%-10s%-11s%-9s%n", "Наименование", "Цена", "Кол-во", "Стоимость");
        System.out.printf("==================================================");
        System.out.println(" ");

        try (FileReader fr = new FileReader("products.txt");
             Scanner scanner = new Scanner(fr)
        ) {
            scanner.useLocale(Locale.ENGLISH);

            while ((scanner.hasNext())) {
                for (int i = 0; i < title.length; i++) {
                    if (scanner.hasNextDouble()) {
                        double d = scanner.nextDouble();
                        price[i] = d;
                        //System.out.println(d);
                    } else if (scanner.hasNextLine()) {
                        String s = scanner.nextLine();
                        title[i] = s;
                        //System.out.println(s);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < title.length; i++) {
            if (title[i] != null) {
                System.out.println(title[i]);
            }
        }
        double t = 0;
        for (int i = 0; i < price.length + 1; i++) {
            if (price[i] == null) {
                price[i] = t;
                price[i] = price[i + 1];


            }
        }


        // System.out.printf("%-30s%n", "Итого: ");
    }
}
