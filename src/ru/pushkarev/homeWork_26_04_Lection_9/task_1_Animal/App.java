package ru.pushkarev.homeWork_26_04_Lection_9.task_1_Animal;

/**
 * 1. Написать абстрактный класс Animal с абстрактным методом getName.
 * Сделать несколько классов животных, наследников Animal.
 * Метод getName должен выводит название каждого животного.
 */


public class App {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.makeSound();
        cat.myName();

        Animal dog = new Dog();
        dog.makeSound();
        dog.myName();

        Animal pig = new Pig();
        pig.makeSound();
        pig.myName();

    }
}
