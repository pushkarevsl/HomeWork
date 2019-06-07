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

    private static String s;

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper ( );

        //считываем из интернета, формат JSON,
        try {
            URL url = new URL ("https://official-joke-api.appspot.com/random_joke");
            try (InputStream is = url.openStream ( );
                 Reader reader = new InputStreamReader (is);
                 BufferedReader bf = new BufferedReader (reader)
            ) {
                s = bf.readLine ( );
                //objectMapper.writeValue (System.out, s);
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        }

        // получаем шутку из строки (аналогично можно из любого потока)

        Reader reader = new StringReader (s);
        Joke joke = objectMapper.readValue (reader, Joke.class);
        System.out.println (joke);

    }
}
