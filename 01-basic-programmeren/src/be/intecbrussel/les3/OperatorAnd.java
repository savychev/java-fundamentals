package be.intecbrussel.les3;

/** Les 3: de EN-operator (&&) — beide voorwaarden moeten waar zijn. */
public class OperatorAnd {
    public static void main(String[] args) {
        //int num = 5;  // valt binnen het bereik
        int num = 15; // valt buiten het bereik

        if (num > 0 && num < 10) {
            System.out.println("Number falls in the range from 0 to 10!");
        } else {
            System.out.println("Number DOESN'T fall in the range from 0 to 10!");
        }
    }
}
