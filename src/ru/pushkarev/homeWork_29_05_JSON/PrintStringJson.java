package ru.pushkarev.homeWork_29_05_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class PrintStringJson {

    public static void main(String[] args) throws IOException {

        Joke joke = new Joke (2, "general", "Бла - бла это смешно", "После лопаты");

        ObjectMapper objectMapper = new ObjectMapper ( );
        //objectMapper.writeValue (System.out, joke);

        String s2 = "{\"id\":2,\"type\":\"general\",\"setup\":\"Бла - бла это смешно\",\"punchline\":\"После лопаты\"}";

        Reader reader = new StringReader (s2);
        Joke joke2 = objectMapper.readValue (reader, Joke.class);

        System.out.println ("Читает из строки");
        System.out.println (joke2);

    }

}
