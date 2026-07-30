package be.intecbrussel.les4;

/** Test: veelvouden van 7 van 1 tot en met 100 met een for-lus. */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0)
                System.out.println(i);
        }
    }
}
