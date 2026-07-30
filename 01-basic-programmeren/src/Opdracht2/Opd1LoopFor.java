package Opdracht2;

/** Oefening: print alle even getallen onder 99 met een for-lus. */
public class Opd1LoopFor {
    public static void main(String[] args) {
        for (int i = 1; i < 99; i++) {
            if (i % 2 == 0) { // even getallen zijn deelbaar door 2
                System.out.println(i);
            }
        }
    }
}
