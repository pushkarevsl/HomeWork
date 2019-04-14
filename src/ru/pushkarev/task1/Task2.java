package ru.pushkarev.task1;
//
//программу,которая считает зарплату «на руки» (на вход программе передается величина зарплаты,
// на выходе печатается зарплата за вычетом 13%(НДФЛ).Пример:на вход подается 70000,на выходе печатается 60900руб.

public class Task2 {
    public static void main(String[] args) {
        int salaryBeforeTax = 1111;
        int tax = 87;
        double salaryAfterTax = (double) tax * salaryBeforeTax / 100;
        System.out.println("Зарплата после подоходного налога в 13%, составляет " + salaryAfterTax + " рублей");
    }
}
