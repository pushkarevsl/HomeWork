package ru.pushkarev.homeWork_24_05_Reader_and_Writer;


import java.io.*;

/**
 * Условие:
 * Написать программу, которая копирует файл с одной кодировкой в файл с другой.
 * <p>
 * 1. создал два файла.
 * 2. заполнил строками, с разными кодировками.
 * 3. скопировал один файл в другой.
 */

public class Main {

    public static String firstFile = "utf8.txt";
    public static String secondFile = "windows1251.txt";


    public static void main(String[] args) throws IOException {

        createFile();

        copyFile();

    }

    //копирование файла

    private static void copyFile() throws IOException {
        try (InputStream is = new FileInputStream(firstFile);
             OutputStream os = new FileOutputStream(secondFile)
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0, length);
            }
        }
    }


// создаем файл и вносим текст

    public static void createFile() throws IOException {

        File file = new File(firstFile);
        File fileCopy = new File(secondFile);

        //вносим строку с кодировкой utf-8, она идет по умолчанию
        try (OutputStream os = new FileOutputStream(file)) {
            String s = "Кодировка UTF-8";
            os.write(s.getBytes());
        }

        try (OutputStream os = new FileOutputStream(fileCopy)) {
            String s = "Кодировка Windows-1251";
            os.write(s.getBytes("Windows-1251"));
        }


    }
}
