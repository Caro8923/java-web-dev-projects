public class Main {
    public static void main(String[] args) {
        SmartPhone caro = new SmartPhone(200.5, "ATT", "blue", 2008, "Carolyn");
        caro.billPaid();
        System.out.println(caro.billPaid);
    }
}
