package ru.pushkarev.classWorkFormatted;

import java.util.*;

public class ClassWork {


    public static void main(String[] args) {

        // %b  это бинарный формат. Показывает да или нет

        System.out.printf("%b%n", false); //false
        System.out.printf("%b%n", 8);
        System.out.printf("%b%n", 0);
        System.out.printf("%b%n", null);// false
        System.out.printf("%b%n", " ");
        System.out.printf("%b%n", new Object());
        System.out.println(" ----------------------");
        // %h hash cod. специальное отображение объекта на числовой ... проекция на int
        System.out.printf("%h%n", null);
        System.out.printf("%h%n", 123456);
        System.out.printf("%h%n", 123456789L);
        System.out.printf("%h%n", " ");
        System.out.printf("%h%n", true);
        //%s string
        System.out.println(" ----------------------");
        System.out.printf("%s%n", null);
        System.out.printf("%s%n", " ");
        System.out.printf("%s%n", "!!!");
        System.out.printf("%s%n", new StrObject1());
        System.out.printf("%s%n", new StrObject2());
        System.out.printf("%s%n", new StrObject3());
        System.out.println(" ----------------------");
        //%d
        System.out.printf("%d%n", 625);
        System.out.printf("%o%n", 625);
        System.out.printf("%x%n", 625);
        System.out.printf("%b%n", 625);
        System.out.println(" ----------------------");
        System.out.printf("%f%n", 12.50);
        System.out.printf("[%+10.2f]%n", 13232.5);// + знак его указываем
        System.out.printf("[%010.2f]%n", 13232.5);// ставим 0, и происходит заполнение 00
        System.out.printf("[%(10.2f]%n", -13232.5);// ставим (, собираем в скобки
        System.out.printf("[%,10.2f]%n", 13232.5);// ставим , это разделитель тысяч
        String s = "Hello, World";
        String s2 = "Hello";
        System.out.printf("[%-20s]%n", s);// - выравнивание по левому краю
        System.out.printf("[%10s]%n", s);
        System.out.printf("[%-10s]%n", s2);// - выравнивание по левому краю
        System.out.printf("[%10.10s]%n", s);
        System.out.printf("[%0,(15.2f]%n", -13232.5);// совместили, заполнение нулями, разделитель тысяч, и скобки
        System.out.println(" ----------------------");
        System.out.printf("[%-20s|%10.2f]%n", s, 234.23);
        System.out.println(" ----------------------");

        //Даты
        Date date = new Date();
        System.out.printf("[%1$tH:%1$tM]%n", date);

        Calendar calendar = Calendar.getInstance();
        System.out.printf("%tR%n", calendar.getTime());
        //same
        System.out.printf("%1$tH:%1$tM%n", calendar.getTime());


    }

    private static class StrObject1 {

    }

    private static class StrObject2 {
        @Override
        public String toString() {
            return "StrObject{}";
        }
    }

    private static class StrObject3 implements Formattable {

        @Override
        public void formatTo(Formatter formatter, int flags, int width, int precision) {
            formatter.format("2323");
        }
    }

}
