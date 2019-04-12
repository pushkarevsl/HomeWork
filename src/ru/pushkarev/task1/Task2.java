package ru.pushkarev.task1;
//
//программу,которая считает зарплату «на руки» (на вход программе передается величина зарплаты,
// на выходе печатается зарплата за вычетом 13%(НДФЛ).Пример:на вход подается 70000,на выходе печатается 60900руб.

public class Task2 {
    public static void main(String[] args) {
        int salaryBeforeTax = 70000;
        double tax = 0.87;
        System.out.println("Зарплата после подоходного налога в 13%, составляет " + tax * salaryBeforeTax + " рублей");
    }
}
