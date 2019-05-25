package ru.pushkarev.homeWork_17_05_File_Path;

import java.io.File;
import java.io.IOException;

public class FileTest {
    /**
     * - Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
     * <p>
     * - Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
     * <p>
     * - Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
     * сдвигая название файла/каталога на соответствующее количество пробелов.
     */

    public static void main(String[] args) {

        System.out.println("= = =  Создаю файл и каталог = = =");

        File file = new File("/Users/a1/IdeaProjects/HomeWork/text.txt");

        try {
            System.out.println("Создаю файл file = text.txt: " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла");
        }

        System.out.println("= = =  Переименовываем фаил + + +");

        File newFile = new File("/Users/a1/IdeaProjects/HomeWork/text2.txt/");
        try {
            System.out.println("Создаю файл newFile = text2.txt: " + newFile.createNewFile());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла");
        }
        System.out.println(newFile.renameTo(file));
        System.out.println(file.getName());

        System.out.println("= = = Удаление файла + = +");

        System.out.println("Удаление файла " + newFile.getName() + ": " + newFile.delete() + ", а все потому, " +
                "что когда переименовываю один файл удаляется. ");
        System.out.println("Удаление файла " + file.getName() + ": " + file.delete());

        System.out.println(" ");
        System.out.println("- - - - А теперь каталоги - - - -");
        System.out.println(" ");

        File dir = new File("../Users/a1/IdeaProjects/HomeWork/src/ru/" +
                "pushkarev/homeWork_17_05_File_Path/a/b");

        dir.mkdir();
        dir.mkdirs();
        System.out.println("Это каталог? - " + dir.isDirectory() + dir.getParent());
        File dir2 = new File("../Users/a1/IdeaProjects/HomeWork/src/ru/" +
                "pushkarev/homeWork_17_05_File_Path/a/b/c");


        dir2.mkdir();
        dir2.mkdirs();
        System.out.println(dir.renameTo(dir2));


    }
}
