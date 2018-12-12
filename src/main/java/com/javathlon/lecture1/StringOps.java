package com.javathlon.lecture1;

import java.util.Arrays;

public class StringOps {
    public static String makeHeadline(String input) {
        input = input.toLowerCase();
        String words[] = input.split("");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(" ")) {
                words[i + 1] = words[i + 1].toUpperCase();
            }
        }

        words[0] = words[0].toUpperCase();

        String revised = String.join("", words);

        int index = 0;

        while(index != -1) {
            index = input.indexOf(("the"), index);
            if(index != -1) {
                String omg = Character.toString(input.charAt(index)).toLowerCase();
                System.out.println(omg);
            }
            if(index == -1) {
                break;
            }
            if(index < input.length() -1) {
                index++;
            }
        }

        return revised;
    }
    public static void main(String[] args) {
        String headline = "tHe IMPOrtance of the independency waR";

        String typeWriter = StringOps.makeHeadline(headline);

        System.out.println(typeWriter);
    }
}
