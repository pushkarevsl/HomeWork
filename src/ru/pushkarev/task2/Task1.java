package ru.pushkarev.task2;

//программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается
// стоимость). Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество бензина");
        int quantity = Integer.parseInt(reader.readLine());
        System.out.println("Введите желаемую стоимость одного литра");
        int valueOneLitre = Integer.parseInt(reader.readLine());

        System.out.println("Стоимость бензина равна " + quantity * valueOneLitre + " руб.");
    }
}