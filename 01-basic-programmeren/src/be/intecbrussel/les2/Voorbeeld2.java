package be.intecbrussel.les2;

/** Les 2: de logische operatoren && (EN), || (OF) en ! (NIET). */
public class Voorbeeld2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result01 = (a && b); // alleen true als beide true zijn
        boolean result02 = (a || b); // true als minstens één true is
        boolean result03 = (!(a && b)); // ! keert het resultaat om

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }
}
