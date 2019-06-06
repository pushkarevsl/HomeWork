package ru.pushkarev.homeWork_29_05_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class PrintStringJson {

    public static void main(String[] args) throws IOException {

        Joke joke = new Joke (2, "general", "Бла - бла это смешно", "После лопаты");

        ObjectMapper objectMapper = new ObjectMapper ( );
        objectMapper.writeValue (System.out, joke);

    }

}
