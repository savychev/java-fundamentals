package be.intecbrussel.les2;

public class Voorbeeld2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result01 = (a && b);
        boolean result02 = (a || b);
        boolean result03 = (!(a && b));

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }
}
