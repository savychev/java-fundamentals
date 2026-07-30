package be.intecbrussel.les4;

/** Les 4: continue slaat alleen de huidige iteratie over (output: 0 t/m 9 zonder 4). */
public class LoopForContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // spring direct naar de volgende iteratie
            }
            System.out.println(i);
        }
    }
}
