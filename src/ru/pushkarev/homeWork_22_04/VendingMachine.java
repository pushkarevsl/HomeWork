
package ru.pushkarev.homeWork_22_04;

import java.util.Arrays;
import java.util.Scanner;

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
    private static int money;
    private int key;
    private int difference;


    private Scanner scanner = new Scanner(System.in);


    void showMenu() {
        if (scanner.nextInt() == 1) {
            for (int i = 0; i < drinks.length; i++)
                System.out.println("№ " + (i + 1) + " " + drinks[i].getTitle() + " " +
                        drinks[i].getPrice() + " руб");
        } else {
            System.out.println("Вы ввели неправильное значение.");  // Как зациклить, чтоб не пропускал вывод меню
        }
    }

    public void addMoney() {
        System.out.println("Определился? Внеси нужную сумму, в купюроприемник!");
        System.out.println(" ");
        System.out.println("Внеси сумму за желаемый напиток");
        money = scanner.nextInt();
        System.out.println("Вы внесли " + money + " руб.");
    }

    public void giveMeADrink() {
        System.out.println("Введите номер напитка из барной карты.");
        key = scanner.nextInt();
        switch (key) {
            case 1:
                if (money == 100) {
                    System.out.println("Спасибо! Возьмите ваш чай.");
                } else if (money < 100) {
                    System.out.println("Извините, но вы внесли недостастаточно средств.");
                    difference = 100 - money;
                    System.out.println("Требуется еще " + difference + " рублей если вы хотите чай");
                } else {
                    difference = money - 100;
                    System.out.println("Возьмите вашу сдачу " + difference + " рублей.");
                    System.out.println("Спасибо! Приходите к нам еще и не забудте ваш чай.");
                }
                break;

            case 2:
                if (money == 120) {
                    System.out.println("Спасибо! Возьмите ваш кофе.");
                } else if (money < 120) {
                    System.out.println("Извините, но вы внесли недостастаточно средств.");
                    difference = 120 - money;
                    System.out.println("Требуется еще " + difference + " рублей если вы хотите кофе");
                } else {
                    difference = money - 120;
                    System.out.println("Возьмите вашу сдачу " + difference + " рублей.");
                    System.out.println("Спасибо! Приходите к нам еще и не забудте ваш кофе.");
                }

                break;
            case 3:
                if (money == 50) {
                    System.out.println("Спасибо! Возьмите вашу воду.");
                } else if (money < 50) {
                    System.out.println("Извините, но вы внесли недостастаточно средств.");
                    difference = 50 - money;
                    System.out.println("Требуется еще " + difference + " рублей если вы хотите воду");
                } else {
                    difference = money - 50;
                    System.out.println("Возьмите вашу сдачу " + difference + " рублей.");
                    System.out.println("Спасибо! Приходите к нам еще и не забудте вашу воду.");
                }
                break;

            case 4:
                if (money == 150) {
                    System.out.println("Спасибо! Возьмите вашу Колу.");
                } else if (money < 150) {
                    System.out.println("Извините, но вы внесли недостастаточно средств.");
                    difference = 150 - money;
                    System.out.println("Требуется еще " + difference + " рублей если вы хотите Колу");
                } else {
                    difference = money - 150;
                    System.out.println("Возьмите вашу сдачу " + difference + " рублей.");
                    System.out.println("Спасибо! Приходите к нам еще и не забудте вашу Колу.");
                }
                break;

            case 5:
                if (money == 150) {
                    System.out.println("Спасибо! Возьмите вашу Пепси.");
                } else if (money < 150) {
                    System.out.println("Извините, но вы внесли недостастаточно средств.");
                    difference = 150 - money;
                    System.out.println("Требуется еще " + difference + " рублей если вы хотите Пепси");
                } else {
                    difference = money - 150;
                    System.out.println("Возьмите вашу сдачу " + difference + " рублей.");
                    System.out.println("Спасибо! Приходите к нам еще и не забудте вашу Пепси.");
                }

                break;
            default:
                System.out.println("Вы ввели не верное значение, попробуйте снова");
        }
        scanner.close();
    }


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
/*

switch (money){
        case 100:
        System.out.println("Спасибо. Ожидайте ваш чай.");
        break;
        case 120:
        System.out.println("Спасибо. Ожидайте ваш кофе");
        case 50:
        System.out.println("Спасибо. Возьмите свою воду");
        case 150:
        System.out.println("Введите 1 если хотите Колу или 2 если желаете Пепси");
        switch (money){
        case 1:
        System.out.println("Возьмите свою колу");
        break;
default:
        System.out.println("Возьмите свой напиток");

        }
default:

        }*/
