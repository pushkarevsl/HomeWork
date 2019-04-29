package ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter;


import java.time.LocalDate;

public class Act {

    private int idNumber;
    private int data;
    private String titleProduct;

    @Override
    public String toString() {
        return "Act{" +
                "idNumber=" + idNumber +
                ", data=" + data +
                ", titleProduct='" + titleProduct + '\'' +
                '}';
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getTitleProduct() {
        return titleProduct;
    }

    public void setTitleProduct(String titleProduct) {
        this.titleProduct = titleProduct;
    }

    public Act(int idNumber, int data, String titleProduct) {
        this.idNumber = idNumber;
        this.data = data;
        this.titleProduct = titleProduct;
    }
}
