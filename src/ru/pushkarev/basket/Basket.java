package ru.pushkarev.basket;

import java.util.Map;

public interface Basket {

    void printPosition();

    void addProduct(String title, int quantity);               //добавить продукт и его количество

    void removeProduct(String title);                          //удалить только продукт

    void updateProductQuantity(String title, int quantity);    //обновить количество продукта

    void clear();                                                //очистка корзины

    Map<String, Integer> getProducts();                         //достань продукт

    int getProductQuantity(String title);                      //достань количество продукта

    String getPosition(String title);
}
