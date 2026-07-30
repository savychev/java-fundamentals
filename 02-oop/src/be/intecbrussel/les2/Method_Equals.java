package be.intecbrussel.les2;

public class Method_Equals {
    public static void main(String[] args) {
        String s1 = "intec";
        String s2 = "intec";
        String s3 = "INTEC";
        String s4 = "Java";

        boolean equal01 = (s1 == s2); // true
        boolean equal02 = (s2 == s3); // false
        boolean equal03 = (s3 == s4); // false

        System.out.println(equal01);
        System.out.println(equal02);
        System.out.println(equal03);

        System.out.println("--- NEXT ---");

        String str1 = "Hello Intec!";
        String str2 = new String("Hello Intec!");
        String str3 = str2;

        boolean equal1 = (str1 == str2);
        boolean equal2 = (str2 == str3);

        System.out.println(equal1);
        System.out.println(equal2);

        boolean equal3 = str1.equals(str2);
        boolean equal4 = str2.equals(str3);

        System.out.println(equal3);
        System.out.println(equal4);

    }
}
