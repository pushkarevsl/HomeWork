package ru.pushkarev.basket;

import java.util.Map;

public interface Basket {

    /*void printPosition();
    @Override
    public void printPosition() {
        for (Map.Entry<String, Integer> entry : positionMap.entrySet ( )) {
            String key = entry.getKey ( );
            Integer value = entry.getValue ( );
            System.out.println (key + " : " + value);
        }
    }*/

    void addProduct(String product, int quantity);               //добавить продукт и его количество

    void removeProduct(String product);                          //удалить только продукт

    void updateProductQuantity(String product, int quantity);    //обновить количество продукта

    void clear();                                                //очистка корзины

    Map<String, Integer> getProducts();                         //достань продукт

    int getProductQuantity(String product);                      //достань количество продукта

    String getPosition(String product);
}
