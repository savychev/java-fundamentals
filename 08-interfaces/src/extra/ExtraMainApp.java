package extra;

/**
 * EXTRA — Demo van: interface als type, default- en static-methodes,
 * meervoudige implementatie en een lambda-teaser.
 */
public class ExtraMainApp {
    public static void main(String[] args) {
        // 1) Interface als type: de array bevat verschillende implementaties.
        Betaalbaar[] betaalmiddelen = {new Bankkaart(120.50), new Smartwatch()};
        for (Betaalbaar middel : betaalmiddelen) {
            middel.betaal(); // default-methode of override, afhankelijk van het object
        }

        // 2) Static-methode: aanroep via de interfacenaam, niet via een object.
        System.out.println("Valuta: " + Betaalbaar.valuta());

        // 3) Meervoudige implementatie: hetzelfde object via een ander contract.
        Draagbaar horloge = new Smartwatch();
        horloge.draag();

        // 4) Lambda-teaser: een functionele interface implementeren zonder klasse.
        Berekening optellen = (a, b) -> a + b;          // lambda i.p.v. aparte klasse
        Berekening vermenigvuldigen = (a, b) -> a * b;
        System.out.println("3 + 4 = " + optellen.bereken(3, 4));
        System.out.println("3 * 4 = " + vermenigvuldigen.bereken(3, 4));
    }
}
