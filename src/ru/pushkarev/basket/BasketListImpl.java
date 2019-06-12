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

import java.util.ArrayList;
import java.util.List;

public class BasketListImpl implements Basket {

    private List<Position> positionList = new ArrayList<> ( );

    @Override
    public void addProduct(String product, int quantity) {
        Position p = getPosition (product);
        if (p == null) {
            p = new Position (product, 0);
            positionList.add (p);
        }
        p.setQuantity (p.getQuantity ( ) + quantity);
    }

    @Override
    public void removeProduct(String product) {
        Position p = getPosition (product);
        positionList.remove (p);

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {
        positionList.clear ( );
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }

    private Position getPosition(String product) {
        for (Position p : positionList) {
            if (p.getProduct ( ).equals (product)) {
                return p;
            }
        }
        return null;
    }
}
