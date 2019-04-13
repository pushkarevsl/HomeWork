package ru.pushkarev.task1;

//программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается
// стоимость). Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.

public class Task1 {
    public static void main(String[] args) {

        int quantity = 50;
        int valueOneLitre = 43;

        System.out.println("Стоимость бензина равна " + quantity * valueOneLitre + " руб.");
    }
}