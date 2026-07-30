package labWerk1;

public class OuterClass {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

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
            return b != 0 ? (double) a / b : Double.NaN;


        }
    }
}
