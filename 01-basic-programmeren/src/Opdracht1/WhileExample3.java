package Opdracht1;

/** Demonstreert een while-lus met vermenigvuldiging: 5, 25, 125, ... onder 10000. */
public class WhileExample3 {
    public static void main(String[] args) {
        int i = 5;

        while (i < 10000) {
            System.out.println(i);
            i *= 5; // i groeit exponentieel
        }
    }
}
