package com.javathlon.lecture1;

public class CompositionTest {
    public static void main(String[] args) {

        Marriage marriage = new Marriage();
        marriage.marriagePlace = "Los Angeles";

        Person p1 = new Person("Angelina", "Jolie");
        Person p2 = new Person("Brad", "Pitt");

        marriage.person1 = p1;
        marriage.person2 = p2;

        System.out.println(marriage.person2.name);
        System.out.println(marriage.person1.surname);
        System.out.println(marriage.marriagePlace);
    }
}
