package labWerk;

public class OuterClassWithStaticInnerClass {
    int a;
    int b;

    public static class MathFunctionsStatic implements MyMath {
        private int a;
        private int b;

        public MathFunctionsStatic() {
        }

        public MathFunctionsStatic(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int sum() {
            return a + b;
        }

        int min() {
            return Math.min(a, b);
        }

        int max() {
            return Math.max(a, b);
        }

        int sum(int a, int b) {
            return a + b;
        }

        int min(int a, int b) {
            return Math.min(a, b);
        }

        int max(int a, int b) {
            return Math.max(a, b);
        }

        @Override
        public double product() {
            return a * b;
        }

        @Override
        public double division() {
            return (double) a / b;
        }
    }
}
