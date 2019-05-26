
package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.vendingMachine;

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
    private static String string;
    private int key;


    private Scanner scanner = new Scanner(System.in);


    void showMenu() {
        System.out.println("Захотелось напитка? Смотри барную карту!");
        for (int i = 0; i < drinks.length; i++)
            System.out.println("№ " + (i + 1) + " " + drinks[i].getTitle() + " " +
                    drinks[i].getPrice() + " руб");
    }


    public void addMoney() {
        System.out.println("Определился? Внеси нужную сумму, в купюроприемник!");
        System.out.println("Внеси сумму за желаемый напиток");
        String s = scanner.nextLine();

        checkString(s);

        //System.out.println(checkString(s));

        if (checkString(s) == true) {
            money = Integer.parseInt(s);
            System.out.println("Вы внесли " + money + " руб.");
        } else {
            System.out.println("Вам нужно вносить деньги, а не писать буквы");
            System.out.println("Повторите внесение денежных средств");
        }
    }
    //проверка вводим число, а не строку

    public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    void giveMeADrink() {

        do {
            System.out.println("Введите номер напитка из барной карты.");
            System.out.println(checkString(string));

            String string = scanner.nextLine();
            key = Integer.parseInt(string);

            /*if (checkString(string) == true) {
                System.out.println("Требуется ввести число, а не букву");
            } else {*/


            int difference;

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
                case 0:
                    System.out.println("Вы ничего не выбрали и вышли из программы");
                    break;

                default:
                    System.out.println("Вы ввели не верное значение, попробуйте снова");
            }
        }
        while (scanner.hasNext());
        scanner.close();
    }


    VendingMachine(Drinks[] drinks) {

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

        VendingMachine.money = money;
    }

    public int getKey() {

        return key;
    }

    public void setKey(int key) {

        this.key = key;
    }

    public static String getString() {
        return string;
    }

    public static void setString(String string) {
        VendingMachine.string = string;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "drinks=" + Arrays.toString(drinks) +
                ", string=" + string +
                ", money=" + money +
                ", key=" + key +
                '}';
    }

}