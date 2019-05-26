package ru.pushkarev.homeWork_17_05_File_Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileTest {
    /**
     * - Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
     * <p>
     * - Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
     * <p>
     * - Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
     * сдвигая название файла/каталога на соответствующее количество пробелов.
     */

    public static void main(String[] args) throws IOException {

        System.out.println("= = =  Создаю файл и каталог = = =");

        File file = new File("text.txt");

        try {
            System.out.println("Создаю файл file = text.txt: " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла");
        }

      /*  System.out.println(" ");
        System.out.println("++++ Копирую файл +++++");
        System.out.println(" ");
        Path path = Files.createFile(Paths.get("/Users/a1/IdeaProjects/HomeWork/path.txt"));

        path = Files.copy(path, Paths.get("/Users/a1/IdeaProjects/HomeWork/fileCopy"), REPLACE_EXISTING) ;
        System.out.println(path.getFileName());
*/
        System.out.println(" ");
        System.out.println("= = =  Переименовываем фаил + + +");

        File newFile = new File("text2.txt");
        try {
            System.out.println("Создаю файл newFile = text2.txt: " + newFile.createNewFile());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла");
        }
        System.out.println(newFile.renameTo(file));
        System.out.println(file.getName());

        System.out.println(" ");
        System.out.println("= = = Удаление файла + = +");

        System.out.println("Удаление файла " + newFile.getName() + ": " + newFile.delete() + ", а все потому, " +
                "что когда переименовываю один файл удаляется. ");
        System.out.println("Удаление файла " + file.getName() + ": " + file.delete());


        System.out.println(" ");
        System.out.println("- - - - А теперь каталоги - - - -");

        File dir = new File("dir/a/b");
        dir.mkdir();
        System.out.println(dir.mkdirs());

        System.out.println("Это каталог? - " + dir.isDirectory() + " " + dir.getParent());

        File dir2 = new File("dir2/c/d/w");
        dir2.mkdir();
        dir2.mkdirs();

        System.out.println("Переименовали каталог: " + dir.renameTo(dir2));


    }
}


