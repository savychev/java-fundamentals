package be.intecbrussel.opdracht1.opdracht1_2;

/**
 * Modelklasse: een paar schoenen met merk, kleur, maat, prijs
 * en een vlag die aangeeft of het paar compleet is.
 */
public class ShoePair {
    private String brand;
    private boolean complete;
    private String colour;
    private int size;
    private double price;

    public ShoePair(String brand, boolean complete, String colour, int size, double price) {
        this.brand = brand;
        this.complete = complete;
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoePair{" +
                "brand='" + brand + '\'' +
                ", complete=" + complete +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public boolean isComplete() {
        return complete;
    }
}
