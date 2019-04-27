package ru.pushkarev.homeWork_19_04_Lection_6;

import java.util.Arrays;

public class GreenHouse { //теплица
    private String title;
    private GardenBed[] gardenBeds = new GardenBed[5];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GardenBed[] getGardenBeds() {
        return gardenBeds;
    }

    public void setGardenBeds(GardenBed[] gardenBeds) {
        this.gardenBeds = gardenBeds;
    }

    @Override
    public String toString() {
        return "GreenHouse{" +
                "title='" + title + '\'' +
                ", gardenBeds=" + Arrays.toString(gardenBeds) +
                '}';
    }
}
