package ru.pushkarev.homeWork_19_04_Lection_6;

import java.time.LocalDate;

public class Product {

    private String title;
    private String titleType;
    private LocalDate dateOfManufacture;


    public Product(String title, String titleType, LocalDate dateOfManufacture) {
        this.title = title;
        this.titleType = titleType;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", titleType='" + titleType + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
