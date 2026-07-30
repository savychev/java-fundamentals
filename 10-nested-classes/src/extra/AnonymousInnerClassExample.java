package extra;

/**
 * Voorbeeld van een ANONIEME inner class: een klasse zonder naam die
 * ter plekke een interface implementeert (of een klasse uitbreidt).
 * Handig voor eenmalig gedrag; sinds Java 8 vaak vervangen door lambda's.
 */
public class AnonymousInnerClassExample {

    /** Klein interface om ter plekke te implementeren. */
    interface Greeting {
        void greet(String name);
    }

    public static void main(String[] args) {
        // Anonieme inner class: implementatie en instantie in een expressie.
        Greeting formeel = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Goedendag, " + name + "!");
            }
        };
        formeel.greet("Anna");

        // Ter vergelijking: hetzelfde interface als lambda (korter, zelfde idee).
        Greeting informeel = name -> System.out.println("Hoi " + name + "!");
        informeel.greet("Anna");
    }
}
