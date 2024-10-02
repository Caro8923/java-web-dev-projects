package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter total points possible: ");
        int pointsPossible = input.nextInt();
        System.out.println("Enter total points scored: ");
        int pointsScored = input.nextInt();
        input.close();

        float score = Divide(pointsScored, pointsPossible);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");


        // Test out your CheckFileExtension() function!
    }

    public static float Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }

        }

        float score = ((float) x /y)*100 ;
        System.out.print("Score is: " + score + "%");
        return score;
    }

    public static int CheckFileExtension(String fileName) {
        int points = 0;

        if (fileName == null) {
            try {
                throw new FileEndingException("File must contain a valid ending");
            } catch (FileEndingException e) {
                e.printStackTrace();
                points -= -1;
            }
        } else if (!fileName.contains(".java")) {
            points += 0;
        } else {
            points += 1;
        }
        return points;
    }
}

