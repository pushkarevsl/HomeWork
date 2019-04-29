package ru.pushkarev.homeWork_19_04_Lection_6;

import java.time.LocalDate;

public class Potato extends Product {
    private String size;

    public Potato(String title, String titleType, LocalDate dateOfManufacture) {
        super(title, titleType, dateOfManufacture);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "size='" + size + '\'' +
                '}';

    }
}
