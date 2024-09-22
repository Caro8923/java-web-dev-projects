public class SmartPhone extends Laptop {
    private Double memoryGB;
    private String wirelessCarrier;
    boolean billPaid = false;

    public SmartPhone (Double aMemoryGB, String aWirelessCarrier, String aColor, Integer aYear, String aOwner) {
        super(aColor, aYear, aOwner);
        memoryGB = aMemoryGB;
        wirelessCarrier = aWirelessCarrier;
    }

    public Double getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(Double memoryGB) {
        this.memoryGB = memoryGB;
    }

    public String getWirelessCarrier() {
        return wirelessCarrier;
    }

    public void setWirelessCarrier(String wirelessCarrier) {
        this.wirelessCarrier = wirelessCarrier;
    }

    public boolean isBillPaid() {
        return billPaid;
    }

    public void setBillPaid(boolean billPaid) {
        this.billPaid = billPaid;
    }

    public void billPaid() {
        billPaid = true;
    }
}
