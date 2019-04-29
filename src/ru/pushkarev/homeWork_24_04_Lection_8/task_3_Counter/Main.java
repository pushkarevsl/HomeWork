package ru.pushkarev.homeWork_24_04_Lection_8.task_3_Counter;


/**
 * 3. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
 * Написать метод для получения информации о количестве.
 */
public class Main {


    private static int counter = 0;

    public static void main(String[] args) {
        Main first = new Main(counter);
        System.out.println(getCounter());

        Main second = new Main(counter);
        System.out.println(getCounter());

        Main third = new Main(counter);
        System.out.println(getCounter());
    }

    private Main(int count) {
        this.count();
    }

    private void count() {
        counter++;
    }

    private static int getCounter() {
        return counter;
    }


}
