package ru.pushkarev.homeWork_29_05_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;

/**
 * Выбрать любой сервис, какой больше нравится,
 * и написать программу, которая с ним взаимодействует.
 * <p>
 * - Класс сериализуемого объекта может содержать не все поля,
 * а только 2-3 ключевых. Например, для погоды достаточно показать диапазон температур.
 * - Минимальное количество запросов к сервису - 1. Не обязательно реализовывать весь функционал,
 * предоставляемый сервисом. Достаточного одного любого запроса
 */

public class JSON {

    public static void main(String[] args) {

        String s;

        //считываем из интернета, формат JSON,
        try {
            URL url = new URL ("https://official-joke-api.appspot.com/random_joke");
            try (InputStream is = url.openStream ( );
                 Reader reader = new InputStreamReader (is);
                 BufferedReader bf = new BufferedReader (reader);
            ) {
                s = bf.readLine ( );
                System.out.println (s);

            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }


        // получаем шутку из строки (аналогично можно из любого потока)

        // Reader reader = new StringReader (s);


    }


}
