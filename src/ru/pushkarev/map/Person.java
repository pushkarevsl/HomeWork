package ru.pushkarev.map;

import java.util.Objects;

public class Person {

    private int age;
    private String surname;
    private String sex;

    Person(int age, String surname, String sex) {
        this.age = age;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals (surname, person.surname) &&
                Objects.equals (sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash (age, surname, sex);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
