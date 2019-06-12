package ru.pushkarev.other;

import java.util.ArrayList;
import java.util.Iterator;
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
 * List<String> getProducts();                                  //достань, распечатай продукт
 * int getProductQuantity(String product);                      //достань количество продукта
 * }
 */

public class Product {

    private String titleProduct;
    private int quantity;

    private static List<Product> product = new ArrayList<> ( );

    public static void main(String[] args) {
        addProduct ("Water", 2);
        removeProduct ("Water");
        //printList ( );
    }

    private static void printList() {
        for (Product value : product) {
            System.out.println (value);
        }
    }

    private static void addProduct(String titleProduct, int quantity) {
        product.add (new Product ("Milk", 1));
        product.add (new Product ("Water", 2));
        product.add (new Product ("Milk", 3));
        product.add (new Product ("Bread", 4));
        product.add (new Product ("Milk", 5));
    }

    private static void removeProduct(String titleProductproduct) {
        for (int i = 0; i < product.size ( ); i++) {
            if (product.get (i).getTitleProduct ( ).equals ("Milk")) {
                System.out.println (product.remove (i));
            } else {
                System.out.println (product.get (i));
            }
        }


    }
/*
    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
*/

    @Override
    public String toString() {
        return "Product{" +
                "titleProduct='" + titleProduct + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    private Product(String titleProduct, int quantity) {
        this.titleProduct = titleProduct;
        this.quantity = quantity;
    }

    private String getTitleProduct() {

        return titleProduct;
    }

    public void setTitleProduct(String titleProduct) {
        this.titleProduct = titleProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
