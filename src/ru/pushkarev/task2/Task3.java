package ru.pushkarev.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//программу, которая конвертирует секунды в часы. Пример: на вход подается 3600, на выходе печатается 1 час.
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите интересуемое количество секунд, для преобразования в часы");
        int seconds = Integer.parseInt(reader.readLine());
        System.out.println(seconds + " секунд составляют " + (seconds * 1.0) / 3600 + " час(а)");
    }
}
