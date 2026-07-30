package be.intecbrussel.extra;

/**
 * Extra voorbeeld: 'final' bij klassen en methodes.
 * - final klasse: kan NIET geerfd worden (zoals String in de JDK).
 * - final methode: kan wel geerfd, maar NIET overschreven worden.
 */
public class FinalVoorbeeld {
    public static void main(String[] args) {
        Rekening rekening = new SpaarRekening();
        rekening.toonSaldo();
    }
}

/** Gewone klasse met een final methode. */
class Rekening {
    // final: subklassen mogen deze berekening niet veranderen.
    final void toonSaldo() {
        System.out.println("Saldo: 100 EUR");
    }
}

/** Erven mag, maar toonSaldo() overschrijven zou een compilefout geven. */
class SpaarRekening extends Rekening {
    // @Override void toonSaldo() { ... }  // FOUT: overridden method is final
}

/** final klasse: 'class X extends Bankkaart' zou een compilefout geven. */
final class Bankkaart {
    void betaal() {
        System.out.println("Betaling uitgevoerd.");
    }
}
