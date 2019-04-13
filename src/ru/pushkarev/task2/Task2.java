package ru.pushkarev.task2;
//
//программу,которая считает зарплату «на руки» (на вход программе передается величина зарплаты,
// на выходе печатается зарплата за вычетом 13%(НДФЛ).Пример:на вход подается 70000,на выходе печатается 60900руб.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вашу зарлату до налога");
        int salaryBeforeTax = Integer.parseInt(reader.readLine());
        double tax = 0.87;
        System.out.println("Зарплата после подоходного налога в 13%, составляет " + tax * salaryBeforeTax + " рублей");
    }
}
