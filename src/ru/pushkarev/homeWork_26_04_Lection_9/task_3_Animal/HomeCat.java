package ru.pushkarev.homeWork_26_04_Lection_9.task_3_Animal;

public class HomeCat extends Animal {


    @Override
    public void run() {
        System.out.println("Мне не зачем и не от кого бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я не умею плавать.");

    }
}
