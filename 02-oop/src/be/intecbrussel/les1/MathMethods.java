package be.intecbrussel.les1;

public class MathMethods {
    public static void main(String[] args) {

        // abs()
        int result = Math.abs(-10); // 10
        System.out.println(result);

        // round()
        int result1 = Math.round(4.6f); // 5
        System.out.println(result1);

        // max()
        int result01 = Math.max(10, 9);
        double result02 = Math.max(10.3, 9.6);
        long result03 = Math.max(17L, 18L);
        float result04 = Math.max(8F, 30.5F);

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);

        // ceil()
        double result2 = Math.ceil(4.1);
        System.out.println(result2);

        // floor()
        double result3 = Math.floor(1.9);
        System.out.println(result3);

        // random()
        double result4 = Math.random();
        System.out.println(result4);
        System.out.println(result4 * 10);

        // pow()
        double result5 = Math.pow(5, 5);
        System.out.println(result5);
    }
}
