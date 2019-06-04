package ru.pushkarev.homeWork_27_05_Bild;

import java.util.Locale;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile {

    static String[] title = new String[30];
    static Double[] price = new Double[50];


    public static void main(String[] args) {

        parsingFile ( );


    }

    // парсим данные из файла и сохраняем в массивы
    private static void parsingFile() {
        try (FileReader fr = new FileReader ("products.txt");
             Scanner scanner = new Scanner (fr)
        ) {
            scanner.useLocale (Locale.ENGLISH);

            while ((scanner.hasNext ( ))) {
                for (int i = 0; i < title.length; i++) {
                    if (scanner.hasNextDouble ( )) {
                        price[i] = scanner.nextDouble ( );
                    } else if (scanner.hasNextLine ( )) {
                        title[i] = scanner.nextLine ( );
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }


}

