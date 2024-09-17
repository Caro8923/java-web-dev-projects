package org.launchcode;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	Menu cpMenu = new Menu ("Chris's Pancakes", "20% tip");
    System.out.println(cpMenu.toString());
    cpMenu.addMenuItems(new MenuItem("Pancakes", 12.99, "pancakes", "main course", true));
    System.out.println(cpMenu.toString());
    cpMenu.addMenuItems(new MenuItem("Waffles", 14.99, "waffles", "main course", true));
    System.out.println(cpMenu.toString());
    cpMenu.addMenuItems(new MenuItem("Eggs", 6.99, "eggs", "main course", true));
    }
}
