package com.javathlon.lecture1;

public class CountWords2 {
    public static int countWords(String source, String searched) {
        //get everything to lc
        source = source.toLowerCase();
        searched = searched.toLowerCase();
        //iteration
        int index = 0;
        //actual count of the searched
        int count = 0;
        //while index exists (out of range = -1, not something smaller than zero)
        while (index != -1) {
            //index = given sentence and the index, starting with zero
            index = source.indexOf(searched, index);
            //If it exists...increment count ^
            if (index != -1) {
                count++;
            }
            //if it doesn't exist then stop
            if(index == -1) {
                break;
            }
            //if the index is less than the source length, -1 because we start at zero, keep iterating.
            if (index < source.length() - 1)
                index++;
        }
        //return the total # of times the word is seen
        return count;
    }

    public static void main(String[] args) {
        //the sentence and the word...
        String sourceString = "Now let's go do something. Let me explain it first.";
        String word = "let";
        //the class w/ the method and arguments.
        int occurrenceCount = CountWords2.countWords(sourceString, word);
        //printing of the word, the total count, and the sentence. BAM
        System.out.println(word + " occurred " + occurrenceCount + " times inside of " + sourceString);
    }
}
