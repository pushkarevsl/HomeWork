package ru.pushkarev.homeWork_17_05_File_Path;

import java.io.File;

public class RecursivePrintTest {

    public static void main(String[] args) {

        File dir = new File("dir");

        recursivePrintFiles(dir);

    }

    private static void recursivePrintFiles(File dir) {

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file);
            } else if (file.isDirectory()) {
                System.out.println(file);
                recursivePrintFiles(file);
            } else {
                recursivePrintFiles(file);
            }
        }
        System.out.println(dir);

    }

}
