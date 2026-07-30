package be.intecbrussel;

/**
 * Het sleutelwoord this: verwijst naar het HUIDIGE object.
 * Drie toepassingen: veld vs. parameter onderscheiden, constructor-chaining
 * met this(...) en het eigen object doorgeven/teruggeven.
 */
public class ThisDemo {
    private String naam;
    private int niveau;

    // 1) this.naam = het veld, naam = de parameter (zelfde naam!)
    public ThisDemo(String naam, int niveau) {
        this.naam = naam;
        this.niveau = niveau;
    }

    // 2) this(...) roept een andere constructor van dezelfde klasse aan
    //    (moet de EERSTE instructie zijn)
    public ThisDemo(String naam) {
        this(naam, 1); // standaardniveau 1
    }

    // 3) return this: handig om aanroepen te ketenen (fluent style)
    public ThisDemo verhoogNiveau() {
        this.niveau++;
        return this;
    }

    @Override
    public String toString() {
        return naam + " (niveau " + niveau + ")";
    }

    public static void main(String[] args) {
        ThisDemo speler = new ThisDemo("Alex");         // via constructor-chaining
        System.out.println(speler);                     // Alex (niveau 1)

        speler.verhoogNiveau().verhoogNiveau();         // ketenen dankzij return this
        System.out.println(speler);                     // Alex (niveau 3)

        ThisDemo baas = new ThisDemo("Sam", 10);        // rechtstreeks
        System.out.println(baas);                       // Sam (niveau 10)
    }
}
