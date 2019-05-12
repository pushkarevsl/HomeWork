package ru.pushkarev.homeWork_MyException;

public class DivisionByZeroException extends Exception {

    @Override
    public String getMessage() {
        return "Произошло деление на 0 ";
    }
}
