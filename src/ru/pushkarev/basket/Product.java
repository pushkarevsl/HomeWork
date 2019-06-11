package ru.pushkarev.basket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product {

    private static List<Product> list = new ArrayList<> ( );

    private String product;
    private int quantity;

    public static void main(String[] args) {
        addProduct ("vatr", 23);
        listIterator ( );
        //removeProduct ("Milk");

    }

    private Product(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    static void addProduct(String product, int quantity) {

        list.add (new Product ("Milk", 1));
        list.add (new Product ("Bread", 2));
        list.add (new Product ("Milk", 3));
        list.add (new Product ("Water", 4));
        list.add (new Product ("Milk", 5));
    }

    static void listIterator() {
        Iterator i = list.iterator ( );
        while (i.hasNext ( )) {
            //System.out.println (i.next ( ));
            System.out.println (i.next ( ));
        }
    }


    static void removeProduct(String product) {
        System.out.println (list.equals ("Milk"));
        list.remove (2);
        System.out.println (list.contains ("Milk"));
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static List<Product> getList() {
        return list;
    }

    public static void setList(List<Product> list) {
        Product.list = list;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
