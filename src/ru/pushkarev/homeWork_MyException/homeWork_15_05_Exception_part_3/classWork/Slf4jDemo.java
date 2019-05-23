package ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.classWork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.pushkarev.homeWork_MyException.homeWork_15_05_Exception_part_3.classWork.JulDemo;

import java.io.FileNotFoundException;

public class Slf4jDemo {
    private static final Logger logger = LoggerFactory.getLogger(JulDemo.class.getName());

    public static void main(String[] args) throws FileNotFoundException {

        logger.info("Начало работы программы.");

        //блок try делаем чтобы пока выводилась на экран
        try {
            doSome("значение");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);

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
