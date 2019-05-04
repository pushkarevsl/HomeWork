package ru.pushkarev.story;

public class BabaYaga extends StoryPerson implements Flyeble, Runeble {



    private String loveEatSmallChild = "Я люблю есть детишек";


    public String getLoveEatSmallChild() {
        return loveEatSmallChild;
    }

    @Override
    public void fly() {
        System.out.println("Я летаю в ступе, махая метлой!");
    }

    @Override
    public void pikirovat() {
        System.out.println("Я не умею пикировать, как змей Горыныч");
    }


    @Override
    public String toString() {
        return "BabaYaga{" +
                "loveEatSmallChild='" + loveEatSmallChild + '\'' +
                '}';
    }


    @Override
    void name() {
        System.out.println("Баба Яга");
    }

    @Override
    void storyName() {
        System.out.println("Сказка про Ивана царевича");

    }

    @Override
    void iAmReal() {
        System.out.println("Я приду за тобой! Ночью!" + " " + loveEatSmallChild);

    }

    @Override
    public void fastRun() {
        System.out.println("А еще я быстро бегаю.");
    }

    @Override
    public void slowlyWent() {

    }
}
