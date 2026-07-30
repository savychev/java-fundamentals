package be.intecbrussel.les2;

/** Les 2: samengestelde toewijzingsoperatoren (+= -= *= /= %=). */
public class Voorbeeld3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;

        c = (a + b); // gewone toewijzing: c = 30
        System.out.println(c);

        c += a; // korte vorm van c = c + a
        System.out.println(c);

        c -= a;
        System.out.println(c);

        c *= a;
        System.out.println(c);

        c /= a;
        System.out.println(c);

        c %= a; // c = rest van c / a
        System.out.println(c);
    }
}
