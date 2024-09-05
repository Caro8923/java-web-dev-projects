package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting" +
                "by her sister on the bank, and of having nothing to do: once" +
                "or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it, 'and what is the" +
                "use of a book,' thought Alice 'without pictures or conversation?";

        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for?");
        String term = input.next();
        Boolean value = sentence.toUpperCase().contains(term.toUpperCase());
        System.out.println("The term " + term + " found in the sentence is " + value);

        Integer index = sentence.indexOf(term);
        Integer length = term.length();
        System.out.println("Your search term first appears at index " + index + ". " +
                "Your term is " + length + " characters long.");


    }
}
