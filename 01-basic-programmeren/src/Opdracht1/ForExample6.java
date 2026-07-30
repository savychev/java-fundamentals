package Opdracht1;

/** Zelfde output als ForExample5, maar met de ternaire operator (?:) in plaats van if/else. */
public class ForExample6 {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            // De ternaire operator kiest tussen twee waarden op basis van de voorwaarde
            String result = i > 0 ? "+" + i : String.valueOf(i);
            System.out.println(result);
        }
    }
}
