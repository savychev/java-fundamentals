package be.intecbrussel.les2;

/** Oefening: impliciete typeconversie — short + float wordt automatisch float. */
public class Oefening4 {
    public static void main(String[] args) {
        short shortNum = 101;
        float floatNum = 10.99F;

        // De short wordt verbreed naar float; de volgorde van de operanden maakt niet uit
        System.out.println(floatNum + shortNum);
        System.out.println(shortNum + floatNum);
    }
}
