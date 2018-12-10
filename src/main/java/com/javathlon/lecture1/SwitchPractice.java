package com.javathlon.lecture1;

public class SwitchPractice {
    public static void main(String[] args) {
        String monthString = "February";

        switch (monthString) {
            case "January":
                System.out.println("We are in January");
                break;
            case "February":
                System.out.println("We are in February");
                break;
        }
        System.out.println(monthString);
    }
}
