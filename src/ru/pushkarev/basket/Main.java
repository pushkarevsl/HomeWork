package ru.pushkarev.basket;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
 * <p>
 * interface Basket {
 * <p>
 * void addProduct(String product, int quantity);               //добавить продукт и его количество
 * void removeProduct(String product);                          //удалить только продукт
 * void updateProductQuantity(String product, int quantity);    //обновить количество продукта
 * void clear();                                                //очистка корзины
 * List<String> getProducts();                                  //достань продукт
 * int getProductQuantity(String product);                      //достань количество продукта
 * }
 */

public class Main implements Basketable {
    List<String> product = new ArrayList<> ( );
    List<Integer> quantity = new ArrayList<> ( );


    @Override
    public void addProduct(String product, int quantity) {

    }
}
