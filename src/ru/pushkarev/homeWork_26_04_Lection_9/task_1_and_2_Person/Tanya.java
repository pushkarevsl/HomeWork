package ru.pushkarev.homeWork_26_04_Lection_9.task_1_and_2_Person;

public class Tanya extends Person implements Swimeble {

    @Override
    public void makeRead() {
        System.out.println("Не люблю читать.");
    }

    @Override
    public void myName() {
        System.out.println("Таня.");
    }

    @Override
    public void swim() {
        System.out.println("Я Чемпионка Европы по плаванию!");
    }
}
