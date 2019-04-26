
package ru.pushkarev.homeWork_22_04;

import java.util.Arrays;

/**
 * //массив с напитками
 * //money
 * <p>
 * //addMoney() // Зачисляет на счет
 * //giveMeADrink(int key)
 * // пользовательский метод, возвращает напиток. Конкретный напиток.
 */

public class VendingMachine {

    private Drinks[] drinks;
    private int money;
    private int key;


    public VendingMachine(Drinks[] drinks) {
        this.drinks = drinks;
    }

    public Drinks[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks[] drinks) {
        this.drinks = drinks;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "drinks=" + Arrays.toString(drinks) +
                ", money=" + money +
                ", key=" + key +
                '}';
    }
}

