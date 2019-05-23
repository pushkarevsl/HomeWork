package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.classWork;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * ДЗ-14
 * Добавить в программу "Вендинговый автомат" логирование.
 * <p>
 * Настроить сбор логов в файл.
 * Фреймворк логирования - на ваш выбор.
 */

public class LogDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.setErr(new PrintStream("log.txt"));

        System.err.println("Начало работы программы.");

        //блок try делаем чтобы пока выводилась на экран
        try {
            doSome("значение");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            System.err.println("Сейчас будет исключение");

        }

        //System.out.println("Пока");
        //System.err.println("Программа завершена.");
    }

    private static void doSome(String value) {
        System.err.println("Вызван метод doSome с параметром < " + value + " >");

        //Придумали ошибку
        throw new RuntimeException("Какая - то ошибка.");
    }
}
