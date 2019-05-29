package ru.pushkarev.homeWork_20_05_Input_and_OutputStream;

import java.io.*;

/**
 * Есть набор объектов типа "Книга". Каждая книга имеет название, автора, год издания. Можно больше, по желанию.
 * <p>
 * Программа должна уметь:
 * <p>
 * добавлять книгу в библиотеку.
 * показывать список книг в библиотеке.
 * восстанавливать содержимое библиотеки после перезапуска.
 * показывать соответствующее сообщение в случае ошибок.
 * Важно!
 * <p>
 * потоки обязательно должны закрываться
 * отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки
 */
public class Main implements Serializable {

    private static final String fileName = "Library.bin";

    public static void main(String[] args) throws Exception {

        Library library = new Library();

        Book book1 = new Book("Букварь", "Народ", 100);
        library.arrayBook(book1);
        Book book2 = new Book("Азбука", "Народ", 50);
        library.arrayBook(book2);

        library.listBooks();

        save(library);

        load(library);


    }

    private static void load(Library library) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName)
        )) {

            System.out.println(ois.readObject());
        }
        }


    private static void save(Library library) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            oos.writeObject(library);
        }
    }


}
