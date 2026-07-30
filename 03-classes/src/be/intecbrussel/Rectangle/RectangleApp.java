package be.intecbrussel.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle(1, 2, 3, 4);
        Rectangle r3 = new Rectangle(r2);
        Rectangle r4 = new Rectangle();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        int resultHeight = r1.getHeight();
        System.out.println(resultHeight);

        int resultWidth = r1.getWidth();
        System.out.println(resultWidth);

        r1.grow(100);
        System.out.println(r1);
    }
}

/*
    Wat gebeurt er als je een negatieve waarde aan setHeight() of setWidth()
    geeft?
    - Dan deze waarde verandert zich automatisch naar positieve waarde en dan positieve waarde toekennen aan eigenschapen van class.

    Kan je een toString()-methode toevoegen aan de klasse Rectangle en
    deze in RectangleApp gebruiken?
    - Ik heb dat al gedaan.

    Voeg een grow(int d) methode-aanroep toe in RectangleApp en toon het
    effect.
    - Heel graag! 21-ste regel. De hoogte en de breedte werd vergroten.
*/