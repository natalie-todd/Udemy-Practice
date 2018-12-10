package com.javathlon.lecture1;

public class StaticClass {
    public static void main(String[] args) {

    Human human = new Human();
    Human human2 = new Human();

        System.out.println(Human.count);

        double piNumber = Math.PI;
        System.out.println(piNumber);

        System.out.println(Math.abs(-3.5));
    }
}
