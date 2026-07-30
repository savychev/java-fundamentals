package be.intecbrussel.les3;

/** Les 3: de OF-operator (||) — minstens één voorwaarde moet waar zijn. */
public class OperatorOr {
    public static void main(String[] args) {
        //int num = 2; // -> Number is not equal to 0!
        int num = 0; // -> Number is equal to 0!

        if (num > 0 || num < 0) {
            System.out.println("Number is not equal to 0!");
        } else {
            System.out.println("Number is equal to 0!");
        }
    }
}
