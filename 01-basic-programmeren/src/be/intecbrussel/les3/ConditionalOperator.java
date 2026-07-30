package be.intecbrussel.les3;

/** Les 3: de ternaire operator (voorwaarde ? waarde1 : waarde2) als korte if/else. */
public class ConditionalOperator {
    public static void main(String[] args) {
        int num = 15;

        String msg = num > 10 ? "Number is bigger than 10" : "Number is smaller than 10";
        System.out.println(msg);
    }
}
