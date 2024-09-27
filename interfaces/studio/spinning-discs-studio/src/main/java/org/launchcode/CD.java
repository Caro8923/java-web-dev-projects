package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(int speed, String fileType, int capacity) {
        super(speed, fileType, capacity);
    }

    @Override
    public void spin() {
        setSpeed(getSpeed() + 300);
    }

    @Override
    public void storeData(int writeAmount) {
        setCapacity(getCapacity() - writeAmount * 2);
    }

    @Override
    public void writeData(int writeAmount) {
        setWriting(true);
        setCapacity(getCapacity() - writeAmount * 2);
    }

    @Override
    public void readData() {
        System.out.println(this.getFileType() + "is playing audio");
    }

    @Override
    public void reportData() {
        System.out.println(this.getFileType() + " is spinning at " + this.getSpeed() + " amount and has " + this.getCapacity() + " units of data remaining.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
