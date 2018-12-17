package com.javathlon.lecture1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlExtractor {
    public static void main(String[] args) {
        String regex = "(http(s)?)://(www\\.)?([a-z0-9]+.[a-z0-9]{2,})/([a-z0-9]*)";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher("https://www.google.com/search");

        boolean isMatch = m.matches();
        if(isMatch) {
            System.out.println("Whole match" + m.group(0));
            System.out.println("protocol" + m.group(1));
            System.out.println("Domain" + m.group(4));
            System.out.println("local path" + m.group(5));
        }
        System.out.println(isMatch);

    }
}
