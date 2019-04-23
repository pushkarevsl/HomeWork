package ru.pushkarev.homeWork_19_04.garden;

import java.util.Arrays;

public class GardenBed { // грядка
    private String title;

    private Potato[] potatoes = new Potato[10];


    @Override
    public String toString() {
        return "GardenBed{" +
                "title='" + title + '\'' +
                ", potatoes=" + Arrays.toString(potatoes) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Potato[] getPotatoes() {
        return potatoes;
    }

    public void setPotatoes(Potato[] potatoes) {
        this.potatoes = potatoes;
    }
}
