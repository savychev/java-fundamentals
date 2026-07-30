package Opdracht1;

/** Demonstreert een while-lus met modulo: veelvouden van 3 tot en met 50. */
public class WhileExample2 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 50) {
            if (i % 3 == 0) { // alleen printen als i deelbaar is door 3
                System.out.println(i);
            }
            i++;
        }
    }
}
