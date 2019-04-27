package ru.pushkarev.homeWork_24_04.task_3_Converter;

/**
 * 3. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
 * Написать метод для получения информации о количестве.
 * <p>
 * 4. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров
 * (массив строк). Написать класс со статическим методом конвертации договора в акт
 * (на вход передавать договор, на выходе получаем акт).
 */


public class App {

    private String title;


    public App(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
