package ru.pushkarev.homeWork_12_04_lection_3;
/*

программу,которая считает зарплату «на руки» (на вход программе передается величина зарплаты,
на выходе печатается зарплата за вычетом 13%(НДФЛ).Пример:на вход подается 70000,на выходе печатается 60900руб.

*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу зарлату до налога");
        int salaryBeforeTax = sc.nextInt();
        int tax = 87;
        double salaryAfterTax = (double) salaryBeforeTax * tax / 100;
        System.out.println("Зарплата после подоходного налога в 13%, составляет " + salaryAfterTax + " рублей");
    }
}
