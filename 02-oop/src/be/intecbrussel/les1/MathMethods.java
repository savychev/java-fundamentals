package be.intecbrussel.les1;

/**
 * Overzicht van veelgebruikte statische methodes van de klasse Math.
 * Math hoeft nooit geinstantieerd te worden: alle methodes zijn static.
 */
public class MathMethods {
    public static void main(String[] args) {

        // abs() - absolute waarde
        int result = Math.abs(-10); // 10
        System.out.println(result);

        // round() - afronden naar het dichtstbijzijnde gehele getal
        int result1 = Math.round(4.6f); // 5
        System.out.println(result1);

        // max() - grootste van twee waarden (overloaded voor int, double, long, float)
        int result01 = Math.max(10, 9);
        double result02 = Math.max(10.3, 9.6);
        long result03 = Math.max(17L, 18L);
        float result04 = Math.max(8F, 30.5F);

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);

        // ceil() - altijd naar boven afronden
        double result2 = Math.ceil(4.1); // 5.0
        System.out.println(result2);

        // floor() - altijd naar beneden afronden
        double result3 = Math.floor(1.9); // 1.0
        System.out.println(result3);

        // random() - willekeurige double tussen 0.0 (inclusief) en 1.0 (exclusief)
        double result4 = Math.random();
        System.out.println(result4);
        System.out.println(result4 * 10); // schalen naar 0-10

        // pow() - machtsverheffen: 5^5
        double result5 = Math.pow(5, 5);
        System.out.println(result5);
    }
}
