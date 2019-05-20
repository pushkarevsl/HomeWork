package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2;

public class MyUnNameException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Спасибо, было вкусно! ";
    }
}
