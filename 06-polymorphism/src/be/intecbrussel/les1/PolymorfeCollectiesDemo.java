package be.intecbrussel.les1;

import java.util.List;

/**
 * Polymorfe arrays en collecties.
 * Een lus over Vorm[] roept telkens de juiste oppervlakte() aan.
 */
public class PolymorfeCollectiesDemo {
    public static void main(String[] args) {
        // Array van het supertype, gevuld met verschillende subtypes
        Vorm[] vormen = {new Cirkel(2), new Rechthoek(3, 4), new Cirkel(1)};

        for (Vorm v : vormen) {
            // dynamic dispatch: per element wordt de juiste oppervlakte() gekozen
            System.out.printf("%s: oppervlakte = %.2f%n", v.naam(), v.oppervlakte());
        }

        // Hetzelfde principe met een collectie
        List<Vorm> lijst = List.of(new Cirkel(1), new Rechthoek(2, 2));
        double totaal = 0;
        for (Vorm v : lijst) {
            totaal += v.oppervlakte();
        }
        System.out.println("Totale oppervlakte: " + totaal);
    }
}

abstract class Vorm {
    abstract double oppervlakte(); // elke subklasse MOET dit invullen

    String naam() {
        return getClass().getSimpleName(); // runtime klassenaam
    }
}

class Cirkel extends Vorm {
    private final double straal;

    Cirkel(double straal) {
        this.straal = straal;
    }

    @Override
    double oppervlakte() {
        return Math.PI * straal * straal;
    }
}

class Rechthoek extends Vorm {
    private final double breedte;
    private final double hoogte;

    Rechthoek(double breedte, double hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    double oppervlakte() {
        return breedte * hoogte;
    }
}
