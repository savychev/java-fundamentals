package be.intecbrussel.les1;

/**
 * StringBuilder versus String bij veel aaneenschakelingen.
 * String + String maakt telkens een nieuw object (traag in een lus);
 * StringBuilder wijzigt intern dezelfde buffer (snel).
 */
public class StringBuilderVsString {
    public static void main(String[] args) {
        int aantal = 20_000;

        // 1) met String: elke += maakt een volledig nieuw object
        long start = System.currentTimeMillis();
        String tekst = "";
        for (int i = 0; i < aantal; i++) {
            tekst += "x";
        }
        long duurString = System.currentTimeMillis() - start;

        // 2) met StringBuilder: append() hergebruikt dezelfde buffer
        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < aantal; i++) {
            builder.append("x");
        }
        String tekst2 = builder.toString(); // pas op het einde een String maken
        long duurBuilder = System.currentTimeMillis() - start;

        System.out.println("String concatenatie: " + duurString + " ms");
        System.out.println("StringBuilder:       " + duurBuilder + " ms");
        System.out.println("Zelfde resultaat? " + (tekst.equals(tekst2))); // true
    }
}
