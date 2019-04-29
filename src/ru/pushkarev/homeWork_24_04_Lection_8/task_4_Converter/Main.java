package ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter;

import ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter.Contract;
import ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter.Converter;

import java.util.Scanner;


/**
 * 4. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 */

public class Main {

    public static void main(String[] args) {


        Contract contract;
        contract = new Contract(234, 23, "dfsdf");
        System.out.println(Converter.convert(contract));

    }
}