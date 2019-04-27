package ru.pushkarev.homeWork_19_04_Lection_6;

import java.time.LocalDate;

public class GardenApp {

    public static void main(String[] args) {
        Potato potato1 = new Potato("голландская", "скороспелая", LocalDate.now());

        potato1.setSize("big");


        GreenHouse forWinter = new GreenHouse();
        forWinter.setTitle("Зимняя теплица");

        GardenBed second = new GardenBed();

        second.setPotatoes(new Potato[]{potato1});

        System.out.println(second);
        System.out.println(forWinter);
    }
}
