package ru.pushkarev.story;

public class App {


    public static void main(String[] args) {


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


    }
}
