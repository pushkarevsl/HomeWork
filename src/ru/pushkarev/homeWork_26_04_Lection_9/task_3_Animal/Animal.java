package ru.pushkarev.homeWork_26_04_Lection_9.task_3_Animal;

/**
 * 3. Написать абстрактный класс Человек, реализующий интерфейсы «бежать» и «плавать»
 * (в каждом сделать 1-2 метода). Сделать несколько наследников этого класса с конкретной
 * реализацией методов, которые объявлены в интерфейсах.
 */

public abstract class Animal implements Swimeble, Runeble {

    public abstract void run();

    public abstract void swim();


}
