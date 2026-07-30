package extra;

/**
 * Demo: een eigen checked exception gooien ('throw') en declareren ('throws').
 * Omdat OngeldigeLeeftijdException checked is, MOET de aanroeper vangen
 * of zelf ook 'throws' declareren.
 */
public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            registreer(15); // gooit onze eigen exception
        } catch (OngeldigeLeeftijdException e) {
            System.out.println("Registratie geweigerd: " + e.getMessage());
        }

        try {
            registreer(25);
        } catch (OngeldigeLeeftijdException e) {
            System.out.println("Komt hier niet: " + e.getMessage());
        }
    }

    // 'throws' verplicht: checked exception die hier niet gevangen wordt.
    static void registreer(int leeftijd) throws OngeldigeLeeftijdException {
        if (leeftijd < 18) {
            throw new OngeldigeLeeftijdException("leeftijd " + leeftijd + " is jonger dan 18");
        }
        System.out.println("Geregistreerd met leeftijd " + leeftijd);
    }
}
