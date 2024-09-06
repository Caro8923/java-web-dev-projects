package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        /*if (radius < 0) {
            System.out.println("Please enter a non-negative number");*/
        while (radius < 0) {
            System.out.println("Please enter a non-negative number: ");
            radius = input.nextDouble();
            if (radius >= 0) {
                double circle = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + circle);
            }
        }
    }
}
