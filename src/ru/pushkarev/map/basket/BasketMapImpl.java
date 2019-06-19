package ru.pushkarev.map.basket;

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
 * Map<String> getProducts();                                  //достань, распечатай продукт
 * int getProductQuantity(String product);                      //достань количество продукта
 * }
 */

public class BasketMapImpl implements Basket {

    private Map<String, Integer> positionMap = new HashMap<> ( );

    @Override
    public String getPosition(String product) {
        for (Map.Entry<String, Integer> entry : positionMap.entrySet ( )) {
            if (entry.getKey ( ).equals (product)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Метод добавления нового продукта. Проходит проверку по ключу, если такого ключа нет, то добавляем,
     * иначе складываем значения, какое было и новое.
     */
    @Override
    public void addProduct(String product, int quantity) {

        String key = getPosition (product);

        if (key == null) {
            positionMap.put (product, quantity);
        } else {
            positionMap.put (product, positionMap.get (product) + quantity); // с этой строкой я занимался сексом 3 дня
        }
    }

    @Override
    public void removeProduct(String product) {
        positionMap.remove (product);
    }

    /**
     * Обновление количества продукта.
     * Так как это предусмотрено в методе addProduct, то его и вызываю
     */
    @Override
    public void updateProductQuantity(String product, int quantity) {
        addProduct (product, quantity);
    }

    /**
     * Очистка Map
     */
    @Override
    public void clear() {
        positionMap.clear ( );
    }

    /**
     * Вывод на экран
     */
    @Override
    public Map<String, Integer> getProducts() {
        for (Map.Entry<String, Integer> entry : positionMap.entrySet ( )) {
            String key = entry.getKey ( );
            Integer value = entry.getValue ( );
            System.out.println (key + " : " + value);
        }
        return positionMap;
    }

    /**
     * Вывод количества по ключу.
     */
    @Override
    public int getProductQuantity(String product) {
        int value = 0;
        for (String key : positionMap.keySet ( )) {
            value = positionMap.get (key);
        }
        return value;
    }
}



