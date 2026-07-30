package be.intecbrussel.extra;

/**
 * Extra: het contrast tussen overriding (runtime polymorfisme)
 * en overloading (compile-time keuze).
 */
public class OverridingVsOverloadingDemo {
    public static void main(String[] args) {
        Printer p = new KleurenPrinter(); // upcasting

        p.print("Hallo"); // OVERRIDING: runtime kiest KleurenPrinter.print(String)
        p.print(42);      // OVERLOADING: de compiler koos print(int) al bij het compileren
    }
}

class Printer {
    void print(String tekst) {
        System.out.println("Zwart-wit: " + tekst);
    }

    // Overload: zelfde naam, andere parameterlijst
    void print(int getal) {
        System.out.println("Getal: " + getal);
    }
}

class KleurenPrinter extends Printer {
    @Override // Override: zelfde signatuur als in Printer, ander gedrag
    void print(String tekst) {
        System.out.println("Kleur: " + tekst);
    }
}
