package ru.pushkarev.homeWork_19_04_Lection_6.softProduct;

import ru.pushkarev.homeWork_19_04_Lection_6.Product;

import java.time.LocalDate;

public class Tomato extends Product {
    private String ripe; //спелый

    public Tomato(String title, String titleType, LocalDate dateOfManufacture) {
        super(title, titleType, dateOfManufacture);
    }


    String getRipe() {
        return ripe;
    }

    void setRipe(String ripe) {
        this.ripe = ripe;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "ripe='" + ripe + '\'' +
                '}';
    }
}