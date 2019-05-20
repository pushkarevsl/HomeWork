package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

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
                    //delishisSoop();
                    break;
                }
                case "картошка": {
                    if (Math.random() < 0.2) {
                        System.out.println("съел … за обе щеки, моя любимая " + Food.POTATO.getTitle());
                        System.out.println("Спасибо мама");

                    } else {
                        System.out.println(" - Фу, херня какая - то");
                        System.out.println("Бдыщь");
                        System.out.println(" - Спасибо мама");
                    }
                    break;
                }
                case "овсянка": {
                    if (Math.random() < 0.4) {
                        System.out.println("съел … за обе щеки, эх снова, эта " + Food.PORRIDGE.getTitle());
                        System.out.println("Спасибо мама");

                    } else {
                        System.out.println(" - Фу, херня какая - то");
                        System.out.println("Бдыщь");
                        System.out.println(" - Спасибо мама");
                    }
                    break;
                }
                case "вкусняшка": {
                    if (Math.random() < 0.9) {
                        System.out.println("съел … за обе щеки, а теперь главная " + Food.DESERT.getTitle());
                        System.out.println("Спасибо мама");

                    } else {
                        System.out.println(" - Фу, херня какая - то");
                        System.out.println("Бдыщь");
                        System.out.println(" - Спасибо мама");
                    }
                    break;
                }
            }
        } while (scanner.hasNext());
    }


}
