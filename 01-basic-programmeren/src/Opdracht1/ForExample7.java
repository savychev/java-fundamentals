package Opdracht1;

/** Demonstreert een samengestelde voorwaarde (&&): getallen deelbaar door 6 én door 28. */
public class ForExample7 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            // beide voorwaarden moeten waar zijn (veelvouden van kgv(6, 28) = 84)
            if (i % 6 == 0 && i % 28 == 0)
                System.out.println(i);
        }
    }
}
