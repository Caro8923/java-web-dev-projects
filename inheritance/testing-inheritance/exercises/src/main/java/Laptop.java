public class Laptop extends Computer {
    private String color;
    private Integer year;

    public Laptop (String aColor, Integer aYear, String aOwner) {
        super(aOwner);
        color = aColor;
        year = aYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public boolean lowBattery() { return !isOn(); }
}