package ru.pushkarev.basket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketMapImpl implements Basket {

    Map<String, Integer> positionMap = new HashMap<> ( );

    @Override
    public void printPosition() {

    }

    @Override
    public void addProduct(String product, int quantity) {

    }

    @Override
    public void removeProduct(String product) {

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<Position> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }

    @Override
    public Position getPosition(String product) {
        return null;
    }
}
