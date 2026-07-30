package les1;

/**
 * Abstracte klasse vs. interface in één voorbeeld.
 * Vuistregel: een abstracte klasse beschrijft wat iets IS (is-een-relatie,
 * gedeelde toestand); een interface beschrijft wat iets KAN (kan-relatie).
 * Zie de vergelijkingstabel in ../08-interfaces/README.md.
 */
public class AbstractVsInterfaceDemo {

    /** Interface: alleen een contract, geen toestand. Meerdere tegelijk mogelijk. */
    interface Zwembaar {
        void zwem(); // impliciet public abstract
    }

    /** Abstracte klasse: toestand (naam) + constructor + deels geïmplementeerd gedrag. */
    static abstract class Dier {
        protected String naam; // velden kunnen NIET in een interface (enkel constanten)

        Dier(String naam) { // een interface heeft nooit een constructor
            this.naam = naam;
        }

        abstract void maakGeluid();

        void slaap() { // gedeelde implementatie voor alle dieren
            System.out.println(naam + " slaapt.");
        }
    }

    /** Eén superklasse (extends) + zoveel interfaces (implements) als je wil. */
    static class Eend extends Dier implements Zwembaar {
        Eend(String naam) {
            super(naam);
        }

        @Override
        void maakGeluid() {
            System.out.println(naam + " zegt: kwak!");
        }

        @Override
        public void zwem() {
            System.out.println(naam + " zwemt in de vijver.");
        }
    }

    public static void main(String[] args) {
        Eend eend = new Eend("Donald");
        eend.maakGeluid(); // uit het abstracte contract
        eend.slaap();      // geërfd gedrag van de abstracte klasse
        eend.zwem();       // uit het interface-contract
    }
}
