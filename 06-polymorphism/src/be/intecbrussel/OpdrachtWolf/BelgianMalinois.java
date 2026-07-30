package be.intecbrussel.OpdrachtWolf;

public class BelgianMalinois extends WildDog {
    private boolean dangerous;
    private double maxRunningSpeed;

    public BelgianMalinois(String name, int lifespan, char size, boolean dangerous, double maxRunningSpeed) {
        super(name, lifespan, size);
        this.dangerous = dangerous;
        this.maxRunningSpeed = maxRunningSpeed;
    }

    public void defend() {
        if (dangerous) {
            System.out.println("Belgian Malinois is klaar om te verdedigen! Pas op!");
        } else {
            System.out.println("Belgian Malinois is een vriendelijke hond en verdedigt niet.");
        }
    }

    public void attack() {
        if (dangerous) {
            System.out.println("Belgian Malinois valt aan met een snelheid van " + maxRunningSpeed + " km/h! Wees voorzichtig!");
        } else {
            System.out.println("Belgian Malinois valt niet aan, hij is een vriendelijke hond.");
        }
    }
}
