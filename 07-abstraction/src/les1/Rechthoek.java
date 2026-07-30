package les1;

/**
 * Tweede concrete subklasse: eigen invulling van hetzelfde contract.
 */
public class Rechthoek extends Vorm {

    private double breedte;
    private double hoogte;

    public Rechthoek(double breedte, double hoogte) {
        super("Rechthoek");
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public double oppervlakte() {
        return breedte * hoogte;
    }
}
