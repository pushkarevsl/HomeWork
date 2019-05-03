package ru.pushkarev.homeWork_26_04_Lection_9.task_1_and_2_Person;

/**
 * 1. Написать абстрактный класс Person с абстрактным методом getName.
 * Сделать несколько классов животных, наследников Person.
 * Метод getName должен выводит название каждого животного.
 * <p>
 * 2. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
 * Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
 * Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
 */


public class App {
    public static void main(String[] args) {

        Katy katy = new Katy();
        katy.myName();
        katy.makeRead();
        katy.run();
        katy.swim();
        katy.fly();

        System.out.println(" ");

        Vasia vasia = new Vasia();
        vasia.myName();
        vasia.makeRead();
        vasia.run();
        vasia.fly();

        System.out.println(" ");

        Tanya tanya = new Tanya();
        tanya.myName();
        tanya.makeRead();
        tanya.swim();
    }
}
