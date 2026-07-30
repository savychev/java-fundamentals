package be.intecbrussel.les4;

/** Oefening: impliciete conversie (widening) — int en long passen automatisch in een double. */
public class Oefening4 {
    public static void main(String[] args) {
        int num1 = 253;
        long num2 = 2365L;

        double numDouble1 = num1; // geen cast nodig: int -> double is verliesvrij
        double numDouble2 = num2;

        System.out.println(numDouble1);
        System.out.println(numDouble2);
    }
}
