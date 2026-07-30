package les1;

/**
 * Demo van de verdiepende voorbeelden:
 * 1) abstracte klasse vs. concrete subklassen (Vorm);
 * 2) Template Method-patroon (WarmeDrank).
 */
public class VormenMainApp {
    public static void main(String[] args) {
        // Vorm v = new Vorm("?"); // compileert NIET: abstracte klasse

        Vorm[] vormen = {new Cirkel(2), new Rechthoek(3, 4)}; // polymorfisme
        for (Vorm vorm : vormen) {
            vorm.beschrijf(); // zelfde aanroep, ander gedrag per subklasse
        }

        System.out.println();

        WarmeDrank koffie = new Koffie();
        koffie.bereid(); // vaste volgorde, koffie-specifieke stappen

        System.out.println();

        WarmeDrank thee = new Thee();
        thee.bereid();
    }
}
