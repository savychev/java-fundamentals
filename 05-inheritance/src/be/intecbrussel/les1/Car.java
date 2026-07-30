package be.intecbrussel.les1;

/**
 * Subklasse (child): erft van Vehicle via 'extends'.
 * Toont overriding met @Override en het aanroepen van de
 * superklasse-versie met super.honk().
 */
public class Car extends Vehicle {
    private String brandName = "Audi";

    public Car() {
        super(); // roept de constructor van Vehicle aan (gebeurt anders impliciet)
        System.out.println("Car class constructor");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override // de compiler controleert dat we echt een supermethode overschrijven
    public void honk() {
        System.out.println("Tuut tuuut!");
    }

    public void sound() {
        super.honk(); // expliciet de ORIGINELE versie uit Vehicle aanroepen
    }
}
