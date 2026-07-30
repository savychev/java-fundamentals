package Opdracht1;

/** Demonstreert if/else binnen een lus: positieve getallen krijgen een plusteken. */
public class ForExample5 {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            if (i > 0)
                System.out.println("+" + i); // expliciet plusteken bij positieve waarden
            else
                System.out.println(i);
        }
    }
}
