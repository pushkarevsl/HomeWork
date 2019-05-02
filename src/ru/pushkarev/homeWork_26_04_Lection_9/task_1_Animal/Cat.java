package ru.pushkarev.homeWork_26_04_Lection_9.task_1_Animal;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Мяу - Мяу");
    }

    @Override
    public void myName() {
        System.out.println("Мистер пушистые штаны!");
    }
}
