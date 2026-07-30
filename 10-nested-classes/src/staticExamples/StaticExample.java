package staticExamples;

/**
 * Demo: wat een static nested class wel en niet kan zien.
 * - static velden van de outer class (b): WEL toegankelijk
 * - instantievelden van de outer class (a): NIET toegankelijk
 */
public class StaticExample {
    private int a = 10;        // instantieveld: hoort bij een object
    private static int b = 2;  // static veld: hoort bij de klasse zelf

    public void print() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.b); // werkt, maar misleidend: b is static, niet van 'this'
    }

    /** Static nested class met een eigen veld a dat het outer-veld a verbergt. */
    public static class Inner {
        int a = 1; // eigen veld, staat los van StaticExample.a

        public void run() {
            System.out.println(a);      // 1: het eigen veld
            System.out.println(this.a); // 1: idem
            System.out.println(b);      // 2: static veld van de outer class
//            System.out.println(this.b); // compileerfout: b is geen veld van Inner
        }
    }
}
