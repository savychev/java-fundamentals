package be.intecbrussel.les2;

public class Oefening2 {
    public static void main(String[] args) {
        boolean bool01 = true;
        boolean bool02 = false;

        boolean result01 = (bool01 && bool02);
        boolean result02 = (bool01 || bool02);
        boolean result03 = (!(bool01 && bool02));

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }
}
