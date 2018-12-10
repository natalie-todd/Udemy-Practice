package com.javathlon.lecture1;

public class Boolean {
    public static void main(String[] args) {
        boolean isBlonde = false;
        boolean isGraduated = true;
        boolean isFemale = true;

        boolean result = (isFemale && isGraduated && !isBlonde) || (!isFemale && isGraduated && isBlonde);

        System.out.println(result);

       char c = 'a';

        c = (char) (c +2);

        System.out.println(c);
    }
}
