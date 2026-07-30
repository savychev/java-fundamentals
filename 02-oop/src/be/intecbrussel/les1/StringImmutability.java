package be.intecbrussel.les1;

/**
 * String is immutable: een String-object kan na aanmaak nooit meer
 * veranderen. Methodes zoals toUpperCase() of concat() geven altijd
 * een NIEUW object terug.
 */
public class StringImmutability {
    public static void main(String[] args) {
        String naam = "intec";

        // dit doet niets met "naam": het resultaat wordt niet opgeslagen
        naam.toUpperCase();
        System.out.println(naam); // intec - onveranderd!

        // het nieuwe object moet je zelf opvangen
        String naamInHoofdletters = naam.toUpperCase();
        System.out.println(naamInHoofdletters); // INTEC

        // ook concat() maakt een nieuwe String
        String begroeting = naam.concat(" brussel");
        System.out.println(naam);       // intec
        System.out.println(begroeting); // intec brussel

        // "naam" lijkt hier te veranderen, maar er wordt gewoon een
        // nieuw object gemaakt en de variabele wijst nu daarnaar
        naam = naam + "!";
        System.out.println(naam); // intec!
    }
}
