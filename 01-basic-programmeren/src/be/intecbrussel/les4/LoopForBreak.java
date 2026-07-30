package be.intecbrussel.les4;

/** Les 4: break stopt de hele lus onmiddellijk (output: 0 t/m 3). */
public class LoopForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // lus wordt hier volledig verlaten
            }
            System.out.println(i);
        }
    }
}
