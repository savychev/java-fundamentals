package les1;

/**
 * Abstracte klasse vs. concrete klasse.
 * Een abstracte klasse kan NIET geïnstantieerd worden:
 * "new Vorm()" geeft een compileerfout. Ze dient als sjabloon
 * voor concrete subklassen zoals Cirkel en Rechthoek.
 */
public abstract class Vorm {

    protected String naam; // gedeelde toestand, ook toegestaan in een abstracte klasse

    protected Vorm(String naam) {
        this.naam = naam; // constructor mag, maar alleen bereikbaar via super()
    }

    public abstract double oppervlakte(); // abstracte methode: subklasse MOET implementeren

    public void beschrijf() { // concrete methode: gewoon geërfd door subklassen
        System.out.println(naam + " heeft oppervlakte " + oppervlakte());
    }
}
