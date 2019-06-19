package ru.pushkarev.map.basket;
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

public class App {

    public static void main(String[] args) {
        App app = new App ( );
        app.runMap ( );
    }

    private void runMap() {
        Basket basketMap = new BasketMapImpl ( );

        basketMap.addProduct ("a1", 1);
        basketMap.addProduct ("a1", 10);
        basketMap.addProduct ("a1", 100);
        basketMap.addProduct ("a2", 2);
        basketMap.addProduct ("a2", 20);
        basketMap.addProduct ("a3", 33);


        //basketMap.updateProductQuantity (); //Обновление количества продукта.

        basketMap.getProducts ( ); //Вывод на экран;
        System.out.println ("// Вывод значения по ключу a3");
        System.out.println (basketMap.getProductQuantity ("a3"));
        System.out.println ("// удаляем элемент по ключу a1");
        basketMap.removeProduct ("a1");
        basketMap.getProducts ( ); //Вывод на экран;

        basketMap.clear ( ); //Очистка Map

    }
}
