package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.classWork;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JulDemo {

    private static final Logger logger = Logger.getLogger(JulDemo.class.getName());

    public static void main(String[] args) throws FileNotFoundException {

        logger.log(Level.FINE, "Начало работы программы.");

        //блок try делаем чтобы пока выводилась на экран
        try {
            doSome("значение");
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            throw new RuntimeException(e);
        } finally {
            System.err.println("Сейчас будет исключение");

        }

        //System.out.println("Пока");
        //System.err.println("Программа завершена.");
    }

    private static void doSome(String value) {
        logger.fine("Вызван метод doSome с параметром < " + value + " >");

        //Придумали ошибку
        throw new RuntimeException("Какая - то ошибка.");
    }
}
