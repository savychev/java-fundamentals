package Opdracht2;

/** Oefening: print alle oneven getallen tot en met 99 met een while-lus. */
public class Opd2LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2; // stap van 2 zodat we alleen oneven getallen tegenkomen
        }
    }
}
