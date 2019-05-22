package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2;

import java.util.Scanner;

import static ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2.MotherException.*;

public class Child {

    public static void showMenu(Food[] foods) {
        for (Food i : foods) {
            System.out.println(i.getTitle());
        }
    }


    public static void doEat() {

        Scanner scanner = new Scanner(System.in);

        do {
            String scan = scanner.next();
            switch (scan) {
                case "суп": {
                    delishisSoop();
                    break;
                }
                case "картошка": {
                    delishisPotato();
                    break;
                }
                case "овсянка": {
                    delishisPorridge();
                    break;
                }
                case "вкусняшка": {
                    delishisDesert();
                    break;
                }
            }
        } while (scanner.hasNext());
    }


}
