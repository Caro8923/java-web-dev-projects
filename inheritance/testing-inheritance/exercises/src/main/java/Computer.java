public class Computer {

    private boolean on = false;
    private String brand = "Apple";
    private String owner;

    //Constructor
    public Computer (String aOwner) { owner = aOwner; }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    //Two Methods
    public void turnOn() {
        on = true;
    }

    public void newOwner (String aOwner) {
        this.owner = aOwner;
    }
}