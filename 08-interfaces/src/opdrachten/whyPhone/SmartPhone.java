package opdrachten.whyPhone;

public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi {
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;

    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println(amountOfPhotos + " photos taken.");
    }

    @Override
    public String[] viewPhotos() {

        return new String[0];
    }

    @Override
    public String locatie(double latitude, double longitude) {
        System.out.println("Located at lat: " + latitude + ", long: " + longitude);
        return "";
    }

    @Override
    public void navigate() {
        System.out.println("Navigation started...");
    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Playing FM: " + fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Changing to FM: " + fm);
    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("Connected to: " + internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Disconnected to: " + internetConnection);
    }
}
