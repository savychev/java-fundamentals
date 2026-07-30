package be.intecbrussel.OpdrachtWolf;

/**
 * Demo van de hondenhierarchie: overerving en polymorfisme in actie.
 */
public class MainApp {
    public static void main(String[] args) {
        Dog akita = new Dog(); // default constructor -> "Unknown", 0, 'M'
        akita.makeNoise();     // geerfd van Wolf

        System.out.println(akita); // roept de overschreven toString() van Dog aan

        Wolf wolf = new BelgianMalinois("Rex", 12, 'L', true, 55.0); // upcasting: subtype in supertype-referentie
        wolf.makeNoise(); // dynamic dispatch: runtime type bepaalt het gedrag

        if (wolf instanceof BelgianMalinois malinois) { // pattern matching: check + cast in een stap
            malinois.defend(); // alleen bereikbaar via het subtype
        }
    }
}
