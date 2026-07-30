package be.intecbrussel.les4;

/** Les 4: do-while als accumulator — de som van 21 aftellend tot en met 11. */
public class LoopDoWhile3 {
    public static void main(String[] args) {
        int x = 21;
        int sum = 0;

        do {
            sum += x; // huidige waarde bij de som optellen
            x--;
        }
        while (x > 10);

        System.out.println("Summation: " + sum);
    }
}
