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

        basketMap.addProduct ("a1", 11);
        basketMap.addProduct ("a1", 12);
        basketMap.addProduct ("a1", 13);
        basketMap.addProduct ("a2", 22);
        basketMap.addProduct ("a3", 33);

        basketMap.removeProduct ("a1"); // удаляем элемент по ключу;

        //basketMap.updateProductQuantity (); //Обновление количества продукта.

        basketMap.getProducts ( ); //Вывод на экран;

        System.out.println (basketMap.getProductQuantity ("a3")); //Вывод количества по ключу.

        //basketMap.clear ( ); //Очистка Map
    }
}
