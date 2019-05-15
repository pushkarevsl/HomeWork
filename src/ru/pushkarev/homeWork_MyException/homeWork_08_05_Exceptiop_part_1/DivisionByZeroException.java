package ru.pushkarev.homeWork_MyException.homeWork_08_05_Exceptiop_part_1;

public class DivisionByZeroException extends Exception {

    @Override
    public String getMessage() {
        return "Произошло деление на 0 ";
    }
}
