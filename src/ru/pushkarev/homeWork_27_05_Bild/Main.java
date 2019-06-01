package ru.pushkarev.homeWork_27_05_Bild;

import java.io.File;
import java.io.FileNotFoundException;
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

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("products.txt");
             Scanner scanner = new Scanner(fr)
        ) {
            scanner.useLocale(Locale.ENGLISH);

            while ((scanner.hasNext())) {

                if (scanner.hasNextDouble()) {
                    double d = scanner.nextDouble();
                    System.out.printf("%-10s: %f%n", "double", d);
                } else {
                    String s = scanner.next();
                    System.out.printf("%-10s: %s%n", "String", s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
