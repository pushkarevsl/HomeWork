package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.classWork;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.io.FileNotFoundException;

public class Log4jDemo {
    private static final Logger logger = Logger.getLogger(JulDemo.class.getName());

    public static void main(String[] args) throws FileNotFoundException {

        logger.log(Priority.INFO, "Начало работы программы.");

        //блок try делаем чтобы пока выводилась на экран
        try {
            doSome("значение");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        } finally {
            System.err.println("Сейчас будет исключение");
        }
        System.out.println("Пока");
        logger.info("Программа завершена.");
    }

    private static void doSome(String value) {
        logger.info("Вызван метод doSome с параметром < " + value + " >");
        logger.warn("Сейчас будет какая - то ошибка");
        //Придумали ошибку
        throw new RuntimeException("Какая - то ошибка.");
    }
}
