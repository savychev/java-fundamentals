package be.intecbrussel.les1;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";
        String strBlank = "";

        // method toUpperCase()
        System.out.println(str.toUpperCase());

        // method toLowerCase()
        System.out.println(str.toLowerCase());

        // method length()
        System.out.println(str.length());

        // method isBlank()
        System.out.println(strBlank.isBlank());

        // method replace()
        System.out.println(str.replace('w', 'W'));

        // method strip()
        String strToStrip = "   hello world!   ";
        System.out.println(strToStrip);
        System.out.println(strToStrip.strip());
        System.out.println(strToStrip.stripLeading());
        System.out.println(strToStrip.stripTrailing());

        // method indexOf()
        System.out.println(str.indexOf("world"));

        // method contains()
        System.out.println(str.contains("world"));

        // method substring()
        System.out.println(str.substring(6, 11));

    }
}
