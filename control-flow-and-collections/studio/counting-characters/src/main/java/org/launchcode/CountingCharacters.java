package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        String myString = inputString.replaceAll("[^a-zA-Z0-9]","");

        /*String myString = "If the product of two terms is " +
                "zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all " +
                "the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of " +
                "the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there.";*/


        char[] charactersInString = myString.toUpperCase().toCharArray();

        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (char letter : charactersInString) {
            if (letterCounts.containsKey(letter)) {
                letterCounts.put(letter, letterCounts.get(letter) + 1);
            } else {
                letterCounts.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> letterCount : letterCounts.entrySet()) {
            System.out.println(letterCount.getKey() + ": " + letterCount.getValue());

        }
    }
}
