package customer;

/**
 * NULL OBJECT-PATROON: dit object vervangt <code>null</code>.
 * In plaats van overal null-checks te schrijven, geeft de factory dit
 * onschadelijke "lege" object terug. Het gedraagt zich neutraal, dus de
 * aanroeper kan gewoon methodes oproepen zonder NullPointerException.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true; // markeert: dit is geen echte klant
    }

    @Override
    public String getName() {
        return "Klant niet gevonden"; // veilig standaardgedrag i.p.v. null
    }
}
