package ru.pushkarev.basket;

import java.util.Map;

public interface Basket {

    void addProduct(String product, int quantity);               //добавить продукт и его количество

    void removeProduct(String product);                          //удалить только продукт

    void updateProductQuantity(String product, int quantity);    //обновить количество продукта

    void clear();                                                //очистка корзины

    Map<String, Integer> getProducts();                         //достань продукт

    int getProductQuantity(String product);                      //достань количество продукта

    String getPosition(String product);
}
