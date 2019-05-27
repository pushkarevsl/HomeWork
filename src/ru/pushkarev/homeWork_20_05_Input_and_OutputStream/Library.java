package ru.pushkarev.homeWork_20_05_Input_and_OutputStream;

import java.io.Serializable;

public class Library implements Serializable {

    public Book[] books = new Book[0];

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    //условно динамический массив

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void writeBooks() {
        for (Book book : books) {
            book;
        }
    }
}
