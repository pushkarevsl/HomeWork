package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.vendingMachine;

public enum Drinks {

    TEA(" Чай   ", 100), COFE(" Кофе  ", 120), WATER(" Вода  ", 50),
    PEPSI(" Пепси ", 150), COLA(" Кола  ", 150);


    @Override
    public String toString() {
        return "Drinks{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    private String title;
    private int price;

    Drinks(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }



}
