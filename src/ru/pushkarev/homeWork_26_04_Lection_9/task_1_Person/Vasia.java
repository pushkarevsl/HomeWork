package ru.pushkarev.homeWork_26_04_Lection_9.task_1_Person;

public class Vasia extends Person implements Flyeble, Runeble {

    @Override
    public void makeRead() {
        System.out.println("Читаю кулинарную книгу.");
    }

    @Override
    public void myName() {
        System.out.println("Василий!");

    }

    @Override
    public void fly() {
        System.out.println("Я летаю на самолете!");
    }

    @Override
    public void run() {
        System.out.println("Нессусь, как ветер!");

    }
}
