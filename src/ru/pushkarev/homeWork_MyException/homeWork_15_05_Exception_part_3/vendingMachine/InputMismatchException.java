package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.vendingMachine;

public class InputMismatchException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Какая - то ошибка";
    }
}
