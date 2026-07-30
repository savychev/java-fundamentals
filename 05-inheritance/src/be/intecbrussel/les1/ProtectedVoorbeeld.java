package be.intecbrussel.les1;

/**
 * Voorbeeld: het access modifier 'protected'.
 * Een protected lid is zichtbaar in de eigen klasse, in hetzelfde package
 * EN in subklassen (ook in andere packages) - maar niet daarbuiten.
 */
public class ProtectedVoorbeeld {
    public static void main(String[] args) {
        Hond hond = new Hond();
        hond.blaf();
        // hond.energie is hier wel bereikbaar omdat we in hetzelfde package zitten;
        // vanuit een ander package zou dat alleen binnen een subklasse kunnen.
    }
}

/** Superklasse met een protected veld en een protected methode. */
class Dier {
    protected int energie = 100; // subklassen mogen dit rechtstreeks gebruiken

    protected void verbruik(int hoeveelheid) {
        energie -= hoeveelheid;
    }
}

/** Subklasse: gebruikt de protected leden van Dier rechtstreeks. */
class Hond extends Dier {
    void blaf() {
        verbruik(5); // protected methode van de superklasse aanroepen
        System.out.println("Woef! Energie over: " + energie); // protected veld lezen
    }
}
