package com.javathlon.lecture1;

public class StringIntroduction {
    public static void main(String[] args) {
        String s = new String("Javathlon.com");
        String s2 = " the best Java course";

        System.out.println(s);
        System.out.println(s2);

        System.out.println(s + s2);

        System.out.println(s);
        System.out.println(s2);

        String s3 = s + s2;

        System.out.println(s3);

        s = s + s2;

        System.out.println("New s value: " + s);
        //Must always reassign otherwise it will be "lost in a parallel universe"
        s = s.concat("String to append");

        System.out.println(s);
    }
}
