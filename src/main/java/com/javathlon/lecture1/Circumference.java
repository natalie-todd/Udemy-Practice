package com.javathlon.lecture1;

public class Circumference {
    public static void main(String[] args) {
        int radius = 85;

        int piInt = 22/7;

        float piFloat = 22.0f / 7.0f;

        double piDouble = 22.0 / 7.0;

        System.out.println(piInt);

        System.out.println(piFloat);

        System.out.println(piDouble);

        System.out.println(2 * piInt * radius);
//int * float = float because float is more "sensitive"
        System.out.println(2 * piFloat * radius);
//int * double = double because double is more "sensitive"
        System.out.println(2 * piDouble * radius);
    }
}
