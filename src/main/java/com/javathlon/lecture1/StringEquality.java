package com.javathlon.lecture1;

public class StringEquality {
    public static void main(String[] args) {
        String s = new String("Javathlon");
        String s2 = new String("Javathlon");

        System.out.println("NEW KEYWORD:" + s.equals(s2));
        System.out.println("NEW KEYWORD:" + (s == s2));

        String stringLiteral1 = "Talha";
        String stringLiteral2 = "Talha";

        System.out.println("NEW LITERAL:" + stringLiteral1.equals(stringLiteral2));
        System.out.println("NEW LITERAL:" + (stringLiteral1==stringLiteral2));
    }
}
