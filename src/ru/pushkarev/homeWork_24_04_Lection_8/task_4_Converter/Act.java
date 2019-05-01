package ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter;


public class Act {

    @Override
    public String toString() {
        return "Act{" +
                "idNumber=" + idNumber +
                ", data=" + data +
                ", titleProduct='" + titleProduct + '\'' +
                '}';
    }

    public Act(int idNumber, int data, String titleProduct) {
        this.idNumber = idNumber;
        this.data = data;
        this.titleProduct = titleProduct;
    }

    private int idNumber;
    private int data;
    private String titleProduct;



}
