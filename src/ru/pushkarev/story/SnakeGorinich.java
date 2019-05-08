package ru.pushkarev.story;

public class SnakeGorinich extends BadHero {

    @Override
    void killer() {
        System.out.println("Убиватель");
    }

    @Override
    public void fly() {
        System.out.println("Умею летать на крыльях");
    }

    @Override
    public void crusher() {
        System.out.println("Разрушу все.");
    }

    @Override
    void name() {
        System.out.println("Змей Горыныч");
    }

    @Override
    void storyName() {
        System.out.println("Сказка про Василису прекрасную");
    }

    @Override
    public void run() {

    }
}
