package be.intecbrussel.les2;

/** Oefening: vergelijkingsoperatoren werken ook tussen verschillende numerieke types (byte, int, long). */
public class Oefening3 {
    public static void main(String[] args) {
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5;

        // byte vs int: de byte wordt automatisch verbreed vóór de vergelijking
        System.out.println(aNum == bNum);
        System.out.println(aNum != bNum);
        System.out.println(aNum > bNum);
        System.out.println(aNum < bNum);
        System.out.println(aNum >= bNum);
        System.out.println(aNum <= bNum);

        // byte vs long
        System.out.println(aNum == cNum);
        System.out.println(aNum != cNum);
        System.out.println(aNum > cNum);
        System.out.println(aNum < cNum);
        System.out.println(aNum >= cNum);
        System.out.println(aNum <= cNum);

        // int vs long
        System.out.println(bNum == cNum);
        System.out.println(bNum != cNum);
        System.out.println(bNum > cNum);
        System.out.println(bNum < cNum);
        System.out.println(bNum >= cNum);
        System.out.println(bNum <= cNum);
    }
}
