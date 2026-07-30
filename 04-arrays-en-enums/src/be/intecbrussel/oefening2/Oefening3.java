package be.intecbrussel.oefening2;

/**
 * Oefening: het gemiddelde van een array berekenen met een while-lus.
 * Valkuil: int / int geeft een afgekapt geheel getal, dus eerst casten naar double.
 */
public class Oefening3 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int i = 0;
        int sum = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }

        // Zonder de cast zou 54 / 7 = 7 zijn (integer-deling) in plaats van 7.71...
        double average = (double) sum / numbers.length;

        System.out.println(average);
    }
}
