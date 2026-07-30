package be.intecbrussel.les2.finalTest;

/**
 * Alle manieren om een final variabele te initialiseren:
 * direct, in een initializer block of in de constructor.
 */
class IntecBrussel {
    // final variabele, direct geinitialiseerd
    final int THRESHOLD = 5;

    // static final constante, direct geinitialiseerd
    static final double PI = 3.141592653589793;

    // blanco final variabele: krijgt haar waarde in het instance initializer block
    final int CAPACITY;

    // blanco static final variabele: krijgt haar waarde in het static block
    final static int DAYS_OF_THE_WEEK;

    // blanco final variabele: krijgt haar waarde in de constructor
    final int MINIMUM;

    // instance initializer block: draait bij elke new, voor de constructor
    {
        CAPACITY = 25;
    }

    // static initializer block: draait een keer, bij het laden van de klasse
    static {
        DAYS_OF_THE_WEEK = 7;
    }

    /*
     * Constructor initialiseert MINIMUM. Let op: bij meerdere constructors
     * moet MINIMUM in elk van hen een waarde krijgen.
     */
    public IntecBrussel() {
        MINIMUM = -1;
    }
}
