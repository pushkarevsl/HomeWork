package ru.pushkarev.story;

public class IvanStupid extends StoryPerson implements Runeble {

    private String ohMyStupidHead = "Упс, опять что - то не сделал";


    @Override
    public void fastRun() {
        System.out.println("Я дурак, я не бегаю!" + " " + ohMyStupidHead);
    }

    @Override
    public void slowlyWent() {

    }

    @Override
    void name() {
        System.out.println("Иван - дурак");
    }

    @Override
    void storyName() {
        System.out.println("Сказка про меня, про Ивана");
    }

    @Override
    void iAmReal() {
        System.out.println("Таких как я много в реальном мире");

    }
}
