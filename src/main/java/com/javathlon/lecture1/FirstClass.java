package com.javathlon.lecture1;

public class FirstClass {
    public static void main(String[] args) {
        //Hello World tutorial
        int count;
        count = 0;

        System.out.println(count);
        System.out.println("Hello world!");

        count = 1;

        System.out.println(count);
//Math and int exercise
        int distance;
        distance = 4750;
        int meters;
        int kilometers;

        meters = distance % 1000;
        kilometers = (distance - meters)/1000;

        System.out.println(distance);
        System.out.println(meters);
        System.out.println(kilometers);
    }
}
