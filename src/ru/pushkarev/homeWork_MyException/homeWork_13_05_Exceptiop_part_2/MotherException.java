package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2;

public class MotherException {

    public static void delishisSoop() {
        double rnd = Math.random();

        try {
            if (rnd < 0.5) {
                throw new MyUnNameException();
            }
            System.out.println("Вкусный суп, хочу добавки. ");
        } catch (MyUnNameException e) {
            System.out.println("Мне не понравился суп. " + e.getMessage());
        } finally {
            System.out.println("Спасибо мама!");
        }
    }

    public static void delishisPotato() {
        double rnd = Math.random();

        try {
            if (rnd < 0.3) {
                throw new MyUnNameException();
            }
            System.out.println("Вкусная картошка, но можно еще супа. ");
        } catch (MyUnNameException e) {
            System.out.println("Мне не понравилась эта картошка. " + e.getMessage());
        } finally {
            System.out.println("Спасибо мама!");
        }
    }

    public static void delishisPorridge() {
        double rnd = Math.random();

        try {
            if (rnd < 0.2) {
                throw new MyUnNameException();
            }
            System.out.println("Вкусная овсянка, но можно я ее есть не буду. ");
        } catch (MyUnNameException e) {
            System.out.println("Мне не понравилась эта каша. " + e.getMessage());
        } finally {
            System.out.println("Спасибо мама!");
        }
    }

    public static void delishisDesert() {
        double rnd = Math.random();

        try {
            if (rnd < 0.8) {
                throw new MyUnNameException();
            }
            System.out.println("Вкусная сладость, добавки хочу. ");
        } catch (MyUnNameException e) {
            System.out.println("Мне не понравилась эта химическая хреноть. " + e.getMessage());
        } finally {
            System.out.println("Спасибо мама!");
        }
    }
}





