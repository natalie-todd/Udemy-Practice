package com.javathlon.lecture1;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int x = 5;
        //apparently Integer is a class...
        Integer xInstance = x;
        Integer xInstance2 = 65;

        String xString = xInstance.toString();
        xString = xString + " goats";
        System.out.println(xString);

        String input = "-89";
        int newInt = Integer.parseInt(input);
        newInt++;
        System.out.println(newInt);
        System.out.println(Math.abs(newInt));

        Double doubleInstance = 6.59;
        doubleInstance.intValue();
        System.out.println(newInt);

        String doubleString = "99.99";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue + 10);

        Double min = Double.min(4.5, 40.6);
        System.out.println(min);

        Short s = 5;
        Long l = 45l;
        Float f = 5.6f;

        Character c = 'R';
        boolean isVADigit = c.isDigit('v');
        System.out.println(isVADigit);

        isVADigit = Character.isDigit(c);
        System.out.println(isVADigit);

        System.out.println(Character.isAlphabetic(c));
    }
}
