package be.intecbrussel.les3;

/** Oefening: positief of niet-positief bepalen met de ternaire operator. */
public class Oefening4 {
    public static void main(String[] args) {
        int num = 0;

        String msg = num > 0 ? "Number is positive." : "Number is not positive.";
        System.out.println(msg);
    }
}
