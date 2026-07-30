package be.intecbrussel.les4;

/** Les 4: while-lus als accumulator — de som van 1 t/m 10 berekenen. */
public class LoopWhile2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i; // telkens de huidige waarde bij de som optellen
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
