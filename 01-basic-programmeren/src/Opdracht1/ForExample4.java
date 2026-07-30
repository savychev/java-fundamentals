package Opdracht1;

/** Variant op ForExample3: machten van 2 onder 10000 (verdubbeling per iteratie). */
public class ForExample4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i *= 2) {
            System.out.println(i);
        }
    }
}
