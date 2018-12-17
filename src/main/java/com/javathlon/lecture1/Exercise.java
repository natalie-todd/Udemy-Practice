package com.javathlon.lecture1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise {

    public String regularExpression = "\\[a-z]";  // write your regular expression here
    private Pattern pattern;

    public Exercise() {
        pattern = Pattern.compile(regularExpression);
    }

    public boolean isStringFullOfLowercaseAlphabeticCharacters(String input) {
        // write your pattern matching code here.
        Exercise test = new Exercise();
//        input = "talha.ockaci@gmail.co.uk";
        Matcher matcher = pattern.matcher(input);
        // if pattern matches return true, else false'
        boolean isMatch = matcher.matches();
        return isMatch;
    }

}