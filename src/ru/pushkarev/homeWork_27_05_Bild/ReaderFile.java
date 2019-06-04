package ru.pushkarev.homeWork_27_05_Bild;

import java.util.Locale;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile {

    //static String[] title = new String[30];
    //static Double[] price = new Double[50];

    public static void main(String[] args) throws IOException {

        parsingFile ( );

    }

    // парсим данные из файла и сохраняем в массивы
    private static void parsingFile() throws IOException {
        try (FileReader fr = new FileReader ("products.txt");
             Scanner scanner = new Scanner (fr)
        ) {
            scanner.useLocale (Locale.ENGLISH);

            System.out.printf ("%-25s%-10s%-10s%-9s%n", "Наименование", "Цена", "Кол-во", "Стоимость");
            System.out.printf ("=======================================================");
            System.out.println (" ");
            while ((scanner.hasNext ( ))) {
                String name = scanner.nextLine ( );
                float quantity = scanner.nextFloat ( );
                float price = scanner.nextFloat ( );
                float result = price * quantity;

                System.out.printf ("%-24s%-8.2f%-3s%-2.3f%6s%-8.3f%n", name, price, "x", quantity, "=", result);
                scanner.nextLine ( );

            }
            System.out.printf ("=======================================================");

        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
    }



