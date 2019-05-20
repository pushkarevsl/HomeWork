package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exceptiop_part_2;

public enum Food {

    SOOP("суп"), POTATO("картошка"), PORRIDGE("овсянка"), DESERT("десерт");

    String title;

    Food(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Food{" +
                "title='" + title + '\'' +
                '}';
    }
}
