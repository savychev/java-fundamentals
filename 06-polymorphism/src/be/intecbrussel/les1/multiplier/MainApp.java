package be.intecbrussel.les1.multiplier;

/**
 * Demo van method overloading (compile-time polymorfisme).
 */
public class MainApp {
    public static void main(String[] args) {
        Multiplier multiNumbers = new Multiplier();

        int result01 = multiNumbers.multiplyNumbers(2, 5);     // kiest de variant met 2 parameters
        int result02 = multiNumbers.multiplyNumbers(2, 5, 10); // kiest de variant met 3 parameters

        System.out.println(result01);
        System.out.println(result02);
    }
}
