package be.intecbrussel.les2.oefening4;

/**
 * Oefening 4: upcasting (impliciet) en downcasting (expliciet).
 */
public class MainApp {
    public static void main(String[] args) {
        // Upcasting: subtype past altijd in een supertype-referentie
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bicycle = new Bicycle();

        // Downcasting: expliciete cast terug naar het subtype.
        // Veilig hier, omdat elk object echt van dat subtype is.
        Car car1 = (Car) car;
        Bike bike1 = (Bike) bike;
        Bicycle bicycle1 = (Bicycle) bicycle;

        // Fout voorbeeld: (Car) bike compileert, maar gooit een ClassCastException
        System.out.println(car1 + " / " + bike1 + " / " + bicycle1);
    }
}
