package be.intecbrussel.oefening2;

/**
 * Oefening: een compacte samenvatting van overerving in een bestand.
 * Werknemer erft van Persoon (extends), geeft de naam door met super(...)
 * en overschrijft stelVoor() met @Override.
 */
public class Oefening1 {
    public static void main(String[] args) {
        Persoon persoon = new Persoon("An");
        persoon.stelVoor(); // de versie van Persoon

        Werknemer werknemer = new Werknemer("Bart", "Intec Brussel");
        werknemer.stelVoor(); // de overschreven versie van Werknemer
    }
}

/** Superklasse: bevat de gemeenschappelijke naam en een voorstelmethode. */
class Persoon {
    private final String naam;

    Persoon(String naam) {
        this.naam = naam;
    }

    String getNaam() {
        return naam;
    }

    void stelVoor() {
        System.out.println("Ik ben " + naam + ".");
    }
}

/** Subklasse: erft de naam en breidt het gedrag uit. */
class Werknemer extends Persoon {
    private final String bedrijf;

    Werknemer(String naam, String bedrijf) {
        super(naam); // verplicht: Persoon heeft geen no-args constructor
        this.bedrijf = bedrijf;
    }

    @Override
    void stelVoor() {
        super.stelVoor(); // eerst de algemene voorstelling van Persoon
        System.out.println("Ik werk bij " + bedrijf + ".");
    }
}
