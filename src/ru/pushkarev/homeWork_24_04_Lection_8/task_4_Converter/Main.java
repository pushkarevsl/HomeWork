package ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter;

/**
 * 4. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 */

public class Main {

    public static void main(String[] args) {

        Contract contract = new Contract(10, 10, "asd");

        System.out.println(Converter.convert(contract));

    }
}