package opdrachten.whyPhone;

/**
 * Interface-segregatie in de praktijk: de telefoon is opgebouwd uit
 * vijf kleine contracten in plaats van één grote interface.
 */
public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi {

    private final double PRICE;
    private final String BRAND;

    public SmartPhone(double price, String brand) {
        this.PRICE = price;
        this.BRAND = brand;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println(amountOfPhotos + " photos taken.");
    }

    @Override
    public String[] viewPhotos() {
        return new String[0]; // nog geen opslag: lege galerij
    }

    @Override
    public String locatie(double latitude, double longitude) {
        System.out.println("Located at lat: " + latitude + ", long: " + longitude);
        return "lat: " + latitude + ", long: " + longitude;
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
        System.out.println("Disconnected from: " + internetConnection); // bugfix: "to" -> "from"
    }

    // startCall/endCall komen gratis mee als default-methodes van ISimCard
}
