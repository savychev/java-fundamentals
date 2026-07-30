package labWerk;

public class OuterClass {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public class MathFunctions implements MyMath {
        public int sum() {
            return a + b;
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
            return (double) a / b;
        }
    }
}
