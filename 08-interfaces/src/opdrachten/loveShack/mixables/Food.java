package opdrachten.loveShack.mixables;

/**
 * Abstracte klasse + interface gecombineerd: Food bewaart de gedeelde
 * toestand (prijs) en belooft via Mixable dat elke subklasse mixbaar is.
 */
public abstract class Food implements Mixable {

    private double pricePerPiece;

    public Food(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public String toString() {
        // leesbare naam voor elke ingrediëntsoort
        return getClass().getSimpleName() + " (" + pricePerPiece + " EUR)";
    }
}
