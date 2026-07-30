package be.intecbrussel;

/**
 * Object-compositie: een klasse gebruikt een ANDER object als veld
 * ("has-a"-relatie). Een Bestelling HEEFT een Klant en een Adres.
 */
public class CompositieDemo {

    static class Adres {
        private final String straat;
        private final String stad;

        Adres(String straat, String stad) {
            this.straat = straat;
            this.stad = stad;
        }

        @Override
        public String toString() {
            return straat + ", " + stad;
        }
    }

    static class Klant {
        private final String naam;
        private final Adres adres; // compositie: Klant HEEFT een Adres

        Klant(String naam, Adres adres) {
            this.naam = naam;
            this.adres = adres;
        }

        public String getNaam() {
            return naam;
        }

        public Adres getAdres() {
            return adres;
        }
    }

    static class Bestelling {
        private final Klant klant; // compositie: Bestelling HEEFT een Klant
        private final String product;

        Bestelling(Klant klant, String product) {
            this.klant = klant;
            this.product = product;
        }

        // via het samengestelde object bereik je de onderliggende objecten
        public void printLeverbon() {
            System.out.println("Product : " + product);
            System.out.println("Klant   : " + klant.getNaam());
            System.out.println("Adres   : " + klant.getAdres());
        }
    }

    public static void main(String[] args) {
        Adres adres = new Adres("Nijverheidskaai 170", "Brussel");
        Klant klant = new Klant("Dmytro", adres);
        Bestelling bestelling = new Bestelling(klant, "Java-handboek");

        bestelling.printLeverbon();
    }
}
