package ru.pushkarev.task2;

//программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается
// стоимость). Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество бензина");
        int quantity = scanner.nextInt();
        System.out.println("Введите желаемую стоимость одного литра");
        int valueOneLitre = scanner.nextInt();
        int result = quantity * valueOneLitre;

        System.out.println("Стоимость бензина равна " + result + " руб.");
    }
}