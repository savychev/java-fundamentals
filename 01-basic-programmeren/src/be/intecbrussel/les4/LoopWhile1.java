package be.intecbrussel.les4;

/** Les 4: while-lus — voorwaarde wordt VOOR elke iteratie gecontroleerd. */
public class LoopWhile1 {
    public static void main(String[] args) {
        int i = 1;

        while (i < 6) {
            System.out.println("Hello world!");
            i++; // zonder deze update loopt de lus oneindig door
        }
    }
}
