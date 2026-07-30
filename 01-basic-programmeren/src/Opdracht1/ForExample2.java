package Opdracht1;

/** Demonstreert een for-lus met modulo: print alle veelvouden van 3 onder 200. */
public class ForExample2 {
    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            // i % 3 == 0 betekent: i is deelbaar door 3
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
