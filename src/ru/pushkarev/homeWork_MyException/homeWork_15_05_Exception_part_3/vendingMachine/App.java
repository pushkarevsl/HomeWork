
package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.vendingMachine;

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


public class App extends InputMismatchException {


    public static void main(String[] args) {

        Drinks[] drinks = new Drinks[]{Drinks.TEA, Drinks.COFE, Drinks.WATER, Drinks.PEPSI, Drinks.COLA};
        VendingMachine vm = new VendingMachine(drinks);


        vm.showMenu();
        vm.addMoney();

        vm.giveMeADrink();

    }
}



