package be.intecbrussel.oefening1.oefening2;

/**
 * Subklasse van Person: combineert this(...) en super(...).
 */
public class Driver extends Person {
    public Driver() {
        this("Unknown"); // roept de constructor MET argument van DEZE klasse aan
        System.out.println("Driver constructor no-args");
    }

    public Driver(String name) {
        super(name); // roept de constructor MET argument van de SUPERKLASSE aan
        System.out.println("Driver constructor with argument 'name' = " + name);
    }
}
