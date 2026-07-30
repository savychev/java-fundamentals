package be.intecbrussel.les2;

public class Oefening3 {
    public static void main(String[] args) {
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5;

        // a - b
        System.out.println(aNum==bNum);
        System.out.println(aNum!=bNum);
        System.out.println(aNum>bNum);
        System.out.println(aNum<bNum);
        System.out.println(aNum>=bNum);
        System.out.println(aNum<=bNum);

        // a - c
        System.out.println(aNum==cNum);
        System.out.println(aNum!=cNum);
        System.out.println(aNum>cNum);
        System.out.println(aNum<cNum);
        System.out.println(aNum>=cNum);
        System.out.println(aNum<=cNum);

        // b - c
        System.out.println(bNum==cNum);
        System.out.println(bNum!=cNum);
        System.out.println(bNum>cNum);
        System.out.println(bNum<cNum);
        System.out.println(bNum>=cNum);
        System.out.println(bNum<=cNum);
    }
}
