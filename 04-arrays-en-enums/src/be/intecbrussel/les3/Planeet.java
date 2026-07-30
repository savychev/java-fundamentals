package be.intecbrussel.les3;

/**
 * Een enum met velden, een constructor en methodes.
 * Elke constante krijgt zijn eigen waarden mee bij de declaratie.
 * De constructor van een enum is altijd private (impliciet).
 */
public enum Planeet {
    MERCURIUS(3.303e+23, 2.4397e6),
    AARDE(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);

    private final double massa;   // in kilogram
    private final double straal;  // in meter

    // Enum-constructor: wordt een keer per constante aangeroepen.
    Planeet(double massa, double straal) {
        this.massa = massa;
        this.straal = straal;
    }

    public double getMassa() {
        return massa;
    }

    public double getStraal() {
        return straal;
    }

    /** Berekent de zwaartekracht aan het oppervlak: G * m / r^2. */
    public double oppervlakteZwaartekracht() {
        final double G = 6.67300E-11; // gravitatieconstante
        return G * massa / (straal * straal);
    }

    public static void main(String[] args) {
        // values() levert alle constanten, elk met eigen veldwaarden.
        for (Planeet p : Planeet.values()) {
            System.out.printf("%s: zwaartekracht = %.2f m/s^2%n", p, p.oppervlakteZwaartekracht());
        }
    }
}
