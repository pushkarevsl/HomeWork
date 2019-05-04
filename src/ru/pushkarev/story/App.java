package ru.pushkarev.story;

public class App {


    public static void main(String[] args) {

        Runeble runeble;
        runeble = new Runeble() {
            @Override
            public void fastRun() {
                System.out.println("Fast run");
            }

            @Override
            public void slowlyWent() {
                System.out.println("Slowly run");
            }
        };

        runeble.fastRun();
        runeble.slowlyWent();
        System.out.println(" ");
        BabaYaga babaYaga = new BabaYaga();
        babaYaga.name();
        babaYaga.storyName();
        babaYaga.iAmReal();
        babaYaga.fly();
        babaYaga.pikirovat();
        babaYaga.fastRun();

        System.out.println(" ");

        ZmeiGorinich zmeiGorinich = new ZmeiGorinich();
        zmeiGorinich.name();
        zmeiGorinich.iAmReal();
        zmeiGorinich.storyName();
        zmeiGorinich.fly();
        zmeiGorinich.pikirovat();
        zmeiGorinich.slowlyWent();

        System.out.println(" ");

        IvanStupid ivanStupid = new IvanStupid();
        ivanStupid.name();
        ivanStupid.storyName();
        ivanStupid.iAmReal();
        ivanStupid.fastRun();


    }
}
