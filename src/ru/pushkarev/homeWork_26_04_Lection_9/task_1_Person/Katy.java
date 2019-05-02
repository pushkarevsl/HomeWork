package ru.pushkarev.homeWork_26_04_Lection_9.task_1_Person;

public class Katy extends Person implements Runeble, Swimeble, Flyeble {

    @Override
    public void fly() {
        System.out.println("А летать я не умею, но так охота!");
    }

    @Override
    public void makeRead() {
        System.out.println("Я читала книгу! Синию.");
    }

    @Override
    public void myName() {
        System.out.println("Катя.");

    }

    @Override
    public void run() {
        System.out.println("Могу бегать, а могу и не бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Еще и плаваю!");
    }
}
