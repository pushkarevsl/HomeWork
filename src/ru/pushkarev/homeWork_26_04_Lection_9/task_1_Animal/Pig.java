package ru.pushkarev.homeWork_26_04_Lection_9.task_1_Animal;

public class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Хрю - Хрю");
    }

    @Override
    public void myName() {
        System.out.println("Можно просто свинья!");
    }
}
