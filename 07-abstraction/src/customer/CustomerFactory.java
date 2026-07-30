package customer;

/**
 * Factory die NOOIT null teruggeeft: een onbekende naam levert een
 * {@link NullCustomer} op. Zo hoeft de aanroeper nergens op null te testen —
 * dat is de kern van het Null Object-patroon.
 */
public class CustomerFactory {

    private static final String[] NAMES = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String bekendeNaam : NAMES) {
            if (bekendeNaam.equalsIgnoreCase(name)) {
                return new RealCustomer(name); // gevonden: echte klant
            }
        }
        return new NullCustomer(); // niet gevonden: null object i.p.v. null
    }
}
