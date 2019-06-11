package ru.pushkarev.basket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product implements Comparable {

    String titleProduct;
    int quantity;

    static List<Product> product = new ArrayList<> ( );

    public static void main(String[] args) {

        addProduct ("Apple", 21);
        printList ( );
    }

    private static void printList() {
        Iterator i = product.iterator ( );
        while (i.hasNext ( )) {
            System.out.println (i.next ( ));
        }
    }

    private static void addProduct(String titleProduct, int quantity) {
        product.add (new Product ("Milk", 1));
        product.add (new Product ("Water", 1));
        product.add (new Product ("Milk", 1));
        product.add (new Product ("Bread", 1));
        product.add (new Product ("Milk", 1));
    }


    @Override
    public String toString() {
        return "Product{" +
                "titleProduct='" + titleProduct + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Product(String titleProduct, int quantity) {
        this.titleProduct = titleProduct;
        this.quantity = quantity;
    }

    public String getTitleProduct() {
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
