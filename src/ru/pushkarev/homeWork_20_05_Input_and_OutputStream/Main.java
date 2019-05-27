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
public class Main {

    public static void main(String[] args) {
        String fileName = "MyLybrary.bin";
        Library library = new Library();

        Book book1 = new Book("Букварь", "Народный", 21);
        library.addBook(book1);
        Book book2 = new Book("Азбука", "Народный", 12);
        library.addBook(book2);

        library.listBooks();

        // Записываем в фаил
        try (OutputStream os = new FileOutputStream(fileName);
             DataOutputStream dos = new DataOutputStream(os)) {


        } catch (IOException e) {
            e.printStackTrace();
        }
        // Достаем данные из файла
        try (InputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis);
        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
