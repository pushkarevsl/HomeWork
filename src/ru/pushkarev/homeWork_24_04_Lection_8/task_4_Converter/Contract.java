package ru.pushkarev.homeWork_24_04_Lection_8.task_4_Converter;

public class Contract {

    private static int idNumber;
    private int data;
    private String titleProduct;

    public Contract(int idNumber, int data, String titleProduct) {
        this.idNumber = idNumber;
        this.data = data;
        this.titleProduct = titleProduct;
    }

    @Override
    public String toString() {
        return "Contract{" +
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
}
