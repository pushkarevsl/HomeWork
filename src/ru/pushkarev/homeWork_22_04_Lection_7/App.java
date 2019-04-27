
package ru.pushkarev.homeWork_22_04_Lection_7;

/**
 * - запрашивает данные у пользователя через сканер
 * <p>
 * - поле для хранения напитков - массив - енам - с расширеннным конструктором -  когда в скобках передается два параметра
 * назнание и цена.
 * - поле деньги
 * <p>
 * - метод который зачисляет на счет addMoney();
 * - метод выдача напитка giveMeADrink(int key);
 */


public class App {


    public static void main(String[] args) {

        System.out.println("Захотелось напитка? Введи единицу! Покажу барную карту!");

        Drinks[] drinks = new Drinks[]{Drinks.TEA, Drinks.COFE, Drinks.WATER, Drinks.PEPSI, Drinks.COLA};

        VendingMachine vm = new VendingMachine(drinks);

        vm.showMenu();

        vm.addMoney();

        vm.giveMeADrink();


    }


}



