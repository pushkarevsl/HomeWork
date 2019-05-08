package ru.pushkarev.story;

public class IvanStupid extends GoodHero {


    @Override
    void guarder() {
        System.out.println("Я супермен!");
    }

    @Override
    void name() {
        System.out.println("Иван дурак");
    }

    @Override
    void storyName() {
        System.out.println("Сказка про Ивана дурака.");
    }

    @Override
    public void run() {
        System.out.println("Не бегу от трудностей!");
    }

    @Override
    public void fly() {

    }
}
