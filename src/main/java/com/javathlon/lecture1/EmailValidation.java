package com.javathlon.lecture1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        String emailValidation = "^[a-zA-Z_.0-9-]+@[a-z0-9]+(\\.[a-z]{2,})+";
        Pattern pattern = Pattern.compile(emailValidation);

        Matcher matcher = pattern.matcher("talha.ockaci@gmail.co.uk");

        boolean isMatch = matcher.matches();

        System.out.println(isMatch);
    }
}
