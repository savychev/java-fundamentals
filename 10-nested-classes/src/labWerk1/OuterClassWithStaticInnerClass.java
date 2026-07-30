package labWerk1;

public class OuterClassWithStaticInnerClass {

    public static class MathFunctionsStatic implements ArithmeticOperations {
        private int a;
        private int b;

        public MathFunctionsStatic() {}

        public MathFunctionsStatic(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int min() { return Math.min(a, b); }
        public int max() { return Math.max(a, b); }
        public int sum() { return a + b; }
        public int product() { return a * b; }
        public double division() { return b != 0 ? (double) a / b : Double.NaN; }
    }
}
