package com.javathlon.lecture1;

public class StringMethods {
    public static void main(String[] args) {
        String s = "This is the best course on the internet";

        int count = s.length();
        System.out.println(count);

        char c = s.charAt(0);
        System.out.println(c);

        char lastLetter = s.charAt(s.length() - 1);
        System.out.println(lastLetter);

        int indexOfIs = s.indexOf("is");
        System.out.println("indexOf " + indexOfIs);
        //Starts looking after the 3rd i
        indexOfIs = s.indexOf("is", 3);
        System.out.println(indexOfIs);

        String sub = s.substring(8);
        System.out.println("**" + sub + "**");

        sub = s.substring(s.indexOf("the"));
        System.out.println(sub);

        sub = s.substring(s.indexOf("the"), 15);
        System.out.println(sub);
        //Out of range exception
//        sub = s.substring(s.indexOf("the"), 90);
//        System.out.println(sub);

        indexOfIs = s.indexOf("Scala");
        System.out.println(indexOfIs);

        //below lines get an exception: out of range -1
//        sub = s.substring(s.indexOf("Scala"), 15);
//        System.out.println(sub);

        if(s.indexOf("scala") >= 0)
            sub = s.substring(s.indexOf("Scala"), 15);
        else
            System.out.println("Scala is not found in this string: " + s);

        indexOfIs = s.lastIndexOf("is");
        System.out.println(indexOfIs);
    }
}
