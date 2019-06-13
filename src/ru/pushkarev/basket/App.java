package ru.pushkarev.basket;
/*
  Реализовать класс корзины интернет магазина по следующему интерфейсу:
  <p>
  interface Basket {
  <p>
  void addProduct(String product, int quantity);               //добавить продукт и его количество
  void removeProduct(String product);                          //удалить только продукт
  void updateProductQuantity(String product, int quantity);    //обновить количество продукта
  void clear();                                                //очистка корзины
  List<String> getProducts();                                  //достань, распечатай продукт
  int getProductQuantity(String product);                      //достань количество продукта
  }
 */

import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App ( );
        app.run ( );
    }

    private void run() {
        Basket listBasket = new BasketListImpl ( );
        listBasket.addProduct ("Milk", 1);
        listBasket.addProduct ("Milk", 1);
        listBasket.addProduct ("Water", 1);
        listBasket.addProduct ("Milk", 1);
        listBasket.addProduct ("Bread", 1);
        listBasket.addProduct ("Water", 1);

        listBasket.printPosition ( );
        System.out.println (" ");
        System.out.println (listBasket.getProducts ( ));
        System.out.println (" ");
        System.out.println (listBasket.getPosition ("Bread"));
        System.out.println (" ");
        System.out.println (listBasket.getProductQuantity ("Water"));
        System.out.println (" ");
        listBasket.removeProduct ("Milk");
        listBasket.printPosition ( );
        System.out.println (" ");
        listBasket.clear ( );
        listBasket.printPosition ( );
    }
}
