package be.intecbrussel.les2;

/** Les 2: alle vergelijkingsoperatoren (== != > < >= <=) leveren een boolean op. */
public class Voorbeeld1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean equal = (a == b); // == vergelijkt waarden, = wijst toe!
        boolean notEqual = (a != b);
        boolean biggerThan = (a > b);
        boolean smallerThan = (a < b);
        boolean biggerEqual = (a >= b);
        boolean smallerEqual = (a <= b);

        System.out.println(equal);
        System.out.println(notEqual);
        System.out.println(biggerThan);
        System.out.println(smallerThan);
        System.out.println(biggerEqual);
        System.out.println(smallerEqual);
    }
}
