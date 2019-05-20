package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2;

import java.util.Scanner;

public class MotherException {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            String scan = scanner.next();
            switch (scan) {
                case "суп": {
                    delishisSoop();
                    break;
                }
            }
        } while (scanner.hasNext());
    }


    public static void delishisSoop() throws MyUnNameException {

        double argument = Math.random();
        try {
            if (argument < 0.3) {
                System.out.println(" - Фу, херня какая - то ");
                System.out.println("Подзатыльник бдыщь!!!");
                throw new RuntimeException();
            }
        } catch (MyUnNameException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" - Спасибо мама");
        }
    }
}





