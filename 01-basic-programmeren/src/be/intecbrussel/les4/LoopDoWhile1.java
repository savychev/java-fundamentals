package be.intecbrussel.les4;

/** Les 4: do-while — de voorwaarde wordt pas NA elke iteratie gecontroleerd. */
public class LoopDoWhile1 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello world!");
            i++;
        }
        while (i < 6);
    }
}
