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
  Map<String> getProducts();                                  //достань, распечатай продукт
  int getProductQuantity(String product);                      //достань количество продукта
  }
 */

import java.util.Map;

public class App {

    public static void main(String[] args) {
        App app = new App ( );
        app.runMap ( );
    }

    private void runMap() {
        Basket basketMap = new BasketMapImpl ( );

        basketMap.addProduct ("qwqd", 21);
        basketMap.printPosition ( );

    }
}
