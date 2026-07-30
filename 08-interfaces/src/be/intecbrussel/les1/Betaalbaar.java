package be.intecbrussel.les1;

/**
 * Interface met de drie soorten methodes (sinds Java 8):
 * 1) abstracte methode  : moet door de klasse ingevuld worden;
 * 2) default-methode    : kant-en-klare implementatie, override is optioneel;
 * 3) static-methode     : hoort bij de interface zelf, aanroep via Betaalbaar.valuta().
 */
public interface Betaalbaar {

    double bedrag(); // abstract: elke implementatie bepaalt zelf het bedrag

    default void betaal() { // default: gedeelde implementatie in de interface
        System.out.println("Er wordt " + bedrag() + " " + valuta() + " betaald.");
    }

    static String valuta() { // static: hoort bij de interface, niet bij een object
        return "EUR";
    }
}
