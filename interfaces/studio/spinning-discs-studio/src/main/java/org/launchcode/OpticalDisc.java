package org.launchcode;

public interface OpticalDisc {

    //Constants
    int SIZE = 120;


    //Methods
    void spin();

    void storeData(int writeAmount);

    void writeData(int writeAmount);

    void readData();

    void reportData();


}
