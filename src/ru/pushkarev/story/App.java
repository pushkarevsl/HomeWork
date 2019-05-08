package ru.pushkarev.story;

public class App {

    public static void main(String[] args) {

        IvanStupid ivanStupid = new IvanStupid();

        ivanStupid.name();
        ivanStupid.storyName();
        ivanStupid.guarder();
        ivanStupid.run();
        System.out.println(" ");

        SnakeGorinich snakeGorinich = new SnakeGorinich();

        snakeGorinich.name();
        snakeGorinich.storyName();
        snakeGorinich.killer();
        snakeGorinich.crusher();
        snakeGorinich.fly();


        String s;

    }

}
