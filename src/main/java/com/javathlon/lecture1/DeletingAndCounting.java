package com.javathlon.lecture1;

public class DeletingAndCounting {
    public static String deleteAll(String sentence, String word) {
        String result = "";
        int index = 0;
        int finder = 0;
        //while index is less than the length of the sentence
        while(index <= sentence.length()) {
            //assign the finder to the word starting from index
            finder = sentence.indexOf(word, index);
            //if it exists
            if(finder == -1) {
                //we will add the substring
                result = result.concat(sentence.substring(index, sentence.length()));
                //and return the result
                return result;
            }
            //substring is in between the index and the finder
            String substring = sentence.substring(index, finder);
            if (finder != -1) {
                index = finder + word.length();
            }
            result = result.concat(substring);
        }
        return result;
    }
    public static void main(String[] args) {
    String sentence = "Javathlon is the best resource to learn Java.";
    String word = "Java";

    String theThingToPrint = DeletingAndCounting.deleteAll(sentence, word);
        System.out.println(theThingToPrint);
    }
}
