package labWerk1;

/**
 * Outer class met een niet-statische inner class die het
 * {@link ArithmeticOperations}-interface implementeert.
 */
public class OuterClass {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * Niet-statische inner class: leest de private velden a en b
     * van de omringende instantie rechtstreeks.
     */
    public class MathFunctions implements ArithmeticOperations {
        public int min() {
            return Math.min(a, b);
        }

        public int max() {
            return Math.max(a, b);
        }

        public int sum() {
            return a + b;
        }

        public int product() {
            return a * b;
        }

        public double division() {
            // Bescherming tegen delen door nul: geef NaN terug in plaats van een crash.
            return b != 0 ? (double) a / b : Double.NaN;
        }
    }
}
