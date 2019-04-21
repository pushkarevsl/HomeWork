package ru.pushkarev.homeWork_19_04;

public class Storage {
    private String nameProduct;
    private String sizeBox;
    private int price;
    private int weight;

    @Override
    public String toString() {
        return "Storage{" +
                "nameProduct='" + nameProduct + '\'' +
                ", sizeBox='" + sizeBox + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getSizeBox() {
        return sizeBox;
    }

    public void setSizeBox(String sizeBox) {
        this.sizeBox = sizeBox;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
