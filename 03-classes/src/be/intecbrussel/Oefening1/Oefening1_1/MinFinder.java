package be.intecbrussel.Oefening1.Oefening1_1;

/**
 * Oefening 1.1 - schrijf een methode die het kleinste van drie
 * getallen kan vinden.
 */
public class MinFinder {
    int min;

    public MinFinder() {
    }

    public int getMin(int first, int second, int third) {
        // <= zorgt ervoor dat gelijke waarden ook correct behandeld worden
        if (first <= second && first <= third)
            min = first;
        else if (second <= first && second <= third)
            min = second;
        else
            min = third;
        return min;
    }
}
