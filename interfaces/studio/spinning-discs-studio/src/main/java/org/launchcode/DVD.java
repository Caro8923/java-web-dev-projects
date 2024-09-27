package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{



    public DVD(int speed, String fileType, int capacity) {
        super(speed, fileType, capacity);
    }

    @Override
    public void spin() {
        setSpeed(getSpeed() + 200);
    }

    @Override
    public void storeData(int writeAmount) {
        setCapacity(getCapacity() - writeAmount);

    }

    @Override
    public void writeData(int writeAmount) {
        setWriting(true);
        setCapacity(getCapacity() - writeAmount);

    }

    @Override
    public void readData() {
        System.out.println(this.getFileType() + "is playing");
    }

    @Override
    public void reportData() {
        System.out.println(this.getFileType() + " is spinning at " + this.getSpeed() + " amount and has " + this.getCapacity() + " units of data remaining.");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
