/**
 * Demo bij {@link Order}: wanneer draaien static- en instantie-initblokken?
 * Het static-blok draait bij het eerste gebruik van de klasse; de
 * instantieblokken pas bij elke new Order().
 */
public class OrderDriver {
    public static void main(String[] args) {
        System.out.println(Order.result + "_"); // (static block) _
        System.out.println(Order.result + "_"); // ongewijzigd: static-blok draait maar een keer
        new Order();                            // + (init block 1) (init block 2)
        new Order();                            // nog een keer beide instantieblokken
        System.out.println(Order.result + "_");
    }
}
