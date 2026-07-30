package be.intecbrussel.les4;

/** Oefening: aftellen van 100 naar 50 met een while-lus. */
public class Oefening2 {
    public static void main(String[] args) {
        int i = 100; // initialisatie van 'i'
        while (i >= 50) { // het lusblok wordt uitgevoerd zolang 'i' groter dan of gelijk aan 50 is
            System.out.println(i);
            i--; // 'i' verlagen bij elke iteratie
        }
    }
}
