package labWerk;

/**
 * Outer class met een niet-statische inner class.
 * Een (niet-statische) inner class heeft rechtstreeks toegang tot de
 * velden van de omringende instantie (hier: a en b).
 */
public class OuterClass {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * Niet-statische inner class: bestaat alleen binnen een instantie
     * van OuterClass (aanmaken via outer.new MathFunctions()).
     */
    public class MathFunctions implements MyMath {
        public int sum() {
            return a + b; // leest a en b van de omringende instantie
        }

        public int min() {
            return Math.min(a, b);
        }

        public int max() {
            return Math.max(a, b);
        }

        @Override
        public double product() {
            return a * b;
        }

        @Override
        public double division() {
            return (double) a / b; // cast naar double voor een niet-afgeronde deling
        }
    }
}
