package be.intecbrussel.les1;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world!");
        System.out.println(str);

        // append()
        StringBuilder str1 = new StringBuilder("Hello");
        str1.append(" world!");
        System.out.println(str1);

        // insert()
        StringBuilder str2 = new StringBuilder("walter, mike");
        str2.insert(6, ", edwin");
        System.out.println(str2);

        // toString()
        StringBuilder str3 = new StringBuilder("Hello world! This is a string.");
        String txt = str3.toString();
        System.out.println(txt);

        // reverse()
        StringBuilder str4 = new StringBuilder("Hello world!");
        System.out.println(str4.reverse());
    }
}
