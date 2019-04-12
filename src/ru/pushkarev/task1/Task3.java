package ru.pushkarev.task1;

//программу, которая конвертирует секунды в часы. Пример: на вход подается 3600, на выходе печатается 1 час.
public class Task3 {
    public static void main(String[] args) {
        int seconds = 3600;
        double hour = (seconds * 1.0) / 3600;
        System.out.println(seconds + " секунд составляют " + hour + " час(а)");

    }
}
