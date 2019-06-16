package ru.pushkarev.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
 * <p>
 * interface Basket {
 * <p>
 * void addProduct(String product, int quantity);               //добавить продукт и его количество
 * void removeProduct(String product);                          //удалить только продукт
 * void updateProductQuantity(String product, int quantity);    //обновить количество продукта
 * void clear();                                                //очистка корзины
 * List<String> getProducts();                                  //достань, распечатай продукт
 * int getProductQuantity(String product);                      //достань количество продукта
 * }
 */

public class BasketMapImpl implements Basket {

    Map<String, Integer> positionMap = new HashMap<> ( );

    /**
     * Проверка, есть ли такой элемент в мапе. Поиск продукта по ключу.
     * @return
     */

    @Override
    public String getPosition(String product) {
        for (Map.Entry<String, Integer> entry : positionMap.entrySet ( )) {
            if (entry.getKey ( ).equals (product)) {
                return entry.getKey ( );
            }
        }
        return null;
    }

    /**
     * Добавляем элемент.
     * Проверяем через метод getPosition, по ключу, если такой элемент есть, то складываем значения,
     * если нет, то добавляет количество продукта к уже имеющемуся.
     */

    public void addProduct(String product, int quantity) {

        String p = getPosition (product);

        for (Map.Entry<String, Integer> entry : positionMap.entrySet ( )) {
            if (p == null) {
                positionMap.put (product, quantity);
            }
            // p.setQuantity (p.getQuantity ( ) + quantity);
        }
    }

    @Override
    public void removeProduct(String title) {

    }

    @Override
    public void updateProductQuantity(String title, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Map<String, Integer> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String title) {
        return 0;
    }

    //получается простой обход, просто вывод на экран.
    @Override
    public void printPosition() {
        for (Map.Entry<String, Integer> entry : positionMap.entrySet ( )) {
            String product = entry.getKey ( );
            int quantity = entry.getValue ( );
            System.out.println (product + ": " + quantity + "  шт.");
        }
    }

}
