package Opdracht1;

/** Demonstreert een for-lus met vermenigvuldiging als stap: machten van 5 onder 10000. */
public class ForExample3 {
    public static void main(String[] args) {
        // De stap hoeft geen ++ te zijn: hier wordt i telkens vervijfvoudigd
        for (int i = 1; i < 10000; i *= 5) {
            System.out.println(i);
        }
    }
}
