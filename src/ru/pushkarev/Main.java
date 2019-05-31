package ru.pushkarev;


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

        library.listBooks(); //просто печатаем содержимое

        save(library); // сохраняем, записываем поток в файл

        Library library1 = load(); // загружаем в новую библиотеку

        System.out.println(" ");
        library1.listBooks();// печатаем новую библиотеку

    }

    private static Library load() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName)
        )) {
            return (Library) ois.readObject();
        }
    }


    private static void save(Library library) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            oos.writeObject(library);
        }
    }
}
