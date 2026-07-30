package be.intecbrussel.Oefening1.Oefening1_1;

// Schrijf een methode die het kleinste nummer van 3 nummers kan vinden.
public class MinFinder {
    int min;

    public MinFinder() {
    }

    public int getMin(int first, int second, int third) {
        if (first <= second && first <= third)
            min = first;
        else if (second <= first && second <= third)
            min = second;
        else
            min = third;
        return min;
    }
}
