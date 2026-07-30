package extra;

/**
 * Voorbeeld van een LOKALE klasse: een klasse die binnen een methode
 * gedeclareerd wordt. Alleen zichtbaar binnen die methode en mag
 * lokale variabelen lezen als die effectief final zijn.
 */
public class LocalClassExample {

    public static void main(String[] args) {
        int basis = 100; // effectief final: wordt hieronder niet meer gewijzigd

        // Lokale klasse: bestaat alleen binnen main.
        class Teller {
            private int stand;

            void verhoog(int delta) {
                stand += delta;
            }

            void print() {
                // Een lokale klasse mag effectief-finale variabelen gebruiken.
                System.out.println("Stand: " + (basis + stand));
            }
        }

        Teller teller = new Teller();
        teller.verhoog(5);
        teller.verhoog(7);
        teller.print(); // Stand: 112
    }
}
