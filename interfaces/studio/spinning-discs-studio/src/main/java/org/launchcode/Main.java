package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd = new CD (200, "mp3", 100);
        DVD dvd = new DVD (500, "mp4", 100);

        dvd.readData();
        cd.readData();

        cd.reportData();
        dvd.reportData();

        cd.storeData(50);
        dvd.storeData(25);

        cd.reportData();
        dvd.reportData();




        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}