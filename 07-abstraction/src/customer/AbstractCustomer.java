package customer;

/**
 * Basisklasse voor het Null Object-patroon.
 * Een abstracte klasse kan NIET geïnstantieerd worden ("new AbstractCustomer()" compileert niet);
 * subklassen zijn VERPLICHT de abstracte methodes te implementeren.
 */
public abstract class AbstractCustomer {

    protected String name; // gedeeld veld voor alle subklassen

    public abstract boolean isNil();   // is dit een "lege" klant? (null object)

    public abstract String getName();  // elke subklasse bepaalt zelf het gedrag
}
