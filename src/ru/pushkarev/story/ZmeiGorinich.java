package ru.pushkarev.story;

public class ZmeiGorinich extends StoryPerson implements Flyeble, Runeble {


    private String head = "У меня три головы, я тебя съем!";

    @Override
    public void fly() {
        System.out.println("Я Летающий змей");
    }

    @Override
    public void pikirovat() {
        System.out.println("Летаю на бреющем полёте!");
    }

    @Override
    void name() {
        System.out.println("Змей Горыныч" + " " + head);
    }

    @Override
    void storyName() {
        System.out.println("Сказка про Ивана дурака");
    }

    @Override
    void iAmReal() {
        System.out.println("Такие, как я остались только в Игре престолов!");
    }

    @Override
    public void fastRun() {

    }

    @Override
    public void slowlyWent() {
        System.out.println("Я только медленно хожу, ползаю и громко матерюсь.");

    }
}
