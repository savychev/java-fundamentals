package customer;

/**
 * De "echte" klant in het Null Object-patroon: dit object bevat echte data.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name; // bugfix: de naam werd voorheen niet opgeslagen
    }

    @Override
    public boolean isNil() {
        return false; // een echte klant is nooit "nil"
    }

    @Override
    public String getName() {
        return name;
    }
}
