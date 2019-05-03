package ru.pushkarev.homeWork_26_04_Lection_9.task_3_Animal;


public class WildCat extends Animal {

    @Override
    public void run() {
        System.out.println("Я быстро бегаю, меня хрен поймаешь.");
    }

    @Override
    public void swim() {
        System.out.println("Я не умею плавать.");
    }

}
