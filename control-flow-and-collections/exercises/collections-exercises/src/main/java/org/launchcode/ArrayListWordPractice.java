package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWordPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // test words below :
        list.add("dog");
        list.add("crate");
        list.add("monkey");
        list.add("henry");
        list.add("plate");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");

        int numChars = input.nextInt();
        for (String word : list) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }
}
