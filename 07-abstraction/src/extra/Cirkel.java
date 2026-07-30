package extra;

/**
 * EXTRA — Concrete subklasse: verplicht om oppervlakte() te implementeren.
 * Laat je de implementatie weg, dan compileert de klasse alleen
 * als je ze zelf ook abstract maakt.
 */
public class Cirkel extends Vorm {

    private double straal;

    public Cirkel(double straal) {
        super("Cirkel");
        this.straal = straal;
    }

    @Override
    public double oppervlakte() {
        return Math.PI * straal * straal; // eigen invulling van het contract
    }
}
