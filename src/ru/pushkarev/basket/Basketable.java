package ru.pushkarev.basket;

/**
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
 * <p>
 * interface Basket {
 * void addProduct(String product, int quantity);
 * void removeProduct(String product);
 * void updateProductQuantity(String product, int quantity);
 * void clear();
 * List<String> getProducts();
 * int getProductQuantity(String product);
 * }
 */

public interface Basketable {

    void addProduct(String product, int quantity);

}
