package com.javathlon.lecture1;

public class Ifs {
    public static void main(String[] args) {
        int result = 40;

        if (100 >= result && result >= 80) {
            System.out.println("Your grade is A for " + result);
        }
        if (80 >= result && result >= 50) {
            System.out.println("Your grade is B for " + result);
        }
        if (50 >= result && result >= 30) {
            System.out.println("Your grade is C for " + result);
        }
        if (30 >= result && result >= 0) {
            System.out.println("Your grade is D for " + result);
        }
        if (60 > result) {
            System.out.println("You may re-attend the exam.");
        } else {
            System.out.println("Thank you for attending the exam.");
        }
    }
}
