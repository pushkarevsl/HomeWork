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
import java.util.Collections;
import java.util.List;

public class BasketListImpl implements Basket {

    private List<Position> positionList = new ArrayList<> ( );


    @Override
    public void printPosition() {
        for (Position position : positionList) {
            System.out.println (position.getProduct ( ) + ": " + position.getQuantity ( ));

        }
    }

    //создаем позицию, происходит вызов метода getPosition, который ищет название и если его нет, то добавляет,
    // иначе добавляет количество продукта к уже имеющемуся.
    @Override
    public void addProduct(String product, int quantity) {
        Position p = getPosition (product);
        if (p == null) {
            p = new Position (product, 0);
            positionList.add (p);
        }
        p.setQuantity (p.getQuantity ( ) + quantity);
        //  эта строка здесь не нужна, ее перенес вниз. хотя посмотрим и под ?
    }

    // этот метод по факту воооообще не нужен, т.к  в addProduct при проверке дублей не допускается
    @Override
    public void removeProduct(String product) {
        Position p = getPosition (product);
        if (p != null) {
            positionList.remove (p);
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        Position p = getPosition (product);
        if (p != null) {
            p.setQuantity (p.getQuantity ( ) + quantity);
        }
    }

    @Override
    public void clear() {
        positionList.clear ( );
    }

    @Override
    public List<Position> getProducts() {

        return positionList;
    }

    @Override
    public int getProductQuantity(String product) {
        return Collections.frequency (positionList, product);
    }

    // Поиск позиции (товара). Проходим по списку позиций, если находим название с данным названием,
// то возвращаем его, если нет, то ничего не возвращаем (нет такого)
    @Override
    public Position getPosition(String product) {
        for (Position p : positionList) {
            if (p.getProduct ( ).equals (product)) {
                return p;
            }
        }
        return null;
    }

}
