package customer;

/**
 * Demo van het Null Object-patroon: geen enkele null-check nodig.
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractCustomer klant1 = CustomerFactory.getCustomer("Rob"); // bekend  -> RealCustomer
        AbstractCustomer klant2 = CustomerFactory.getCustomer("Bob"); // onbekend -> NullCustomer

        // Beide aanroepen zijn veilig: het null object gedraagt zich netjes.
        System.out.println(klant1.getName() + " (nil? " + klant1.isNil() + ")");
        System.out.println(klant2.getName() + " (nil? " + klant2.isNil() + ")");
    }
}
