package extra;

/**
 * EXTRA — Meervoudige implementatie: één klasse, twee contracten.
 * De default-methode betaal() wordt hier WEL overschreven.
 */
public class Smartwatch implements Betaalbaar, Draagbaar {

    @Override
    public double bedrag() {
        return 25.0;
    }

    @Override
    public void betaal() { // override van de default-methode
        System.out.println("Tik met de smartwatch: " + bedrag() + " " + Betaalbaar.valuta());
    }

    @Override
    public void draag() {
        System.out.println("De smartwatch zit om de pols.");
    }
}
