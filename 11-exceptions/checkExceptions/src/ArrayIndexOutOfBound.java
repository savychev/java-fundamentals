/**
 * Demo: ArrayIndexOutOfBoundsException (unchecked).
 * De lus telt bewust verder dan de array lang is; de catch vangt de fout op.
 */
public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        String[] maanden = {"Januari", "Februari", "Maart", "April", "Mei"};
        try {
            for (int i = 0; i < 10; i++) { // 10 > maanden.length: gaat mis bij i = 5
                System.out.println(maanden[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Een lege catch verbergt fouten; meld altijd wat er gebeurde.
            System.out.println("Index buiten bereik: " + e.getMessage());
        }
    }
}
