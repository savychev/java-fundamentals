package be.intecbrussel.les4;

/** Oefening: expliciete cast (narrowing) — double naar int, de decimalen worden afgekapt. */
public class Oefening5 {
    public static void main(String[] args) {
        double num = 10.99;

        int numInt = (int) num; // expliciete cast verplicht; resultaat is 10 (geen afronding!)

        System.out.println(numInt);
    }
}
