package be.intecbrussel.les4;

/** Oefening: veelvouden van 7 van 100 aftellend naar 1 met een for-lus. */
public class Oefening1 {
    public static void main(String[] args) {
        // 'i' begint op 100; het lusblok wordt uitgevoerd zolang 'i' groter dan 0 is
        for (int i = 100; i > 0; i--) {
            if (i % 7 == 0)
                System.out.println(i);
        }
    }
}
