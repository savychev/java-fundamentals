package be.intecbrussel.Rectangle;

/**
 * Demo bij Rectangle: alle vier de constructors, toString() via
 * println en het effect van grow().
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle(1, 2, 3, 4);
        Rectangle r3 = new Rectangle(r2); // kopie van r2
        Rectangle r4 = new Rectangle();   // standaardwaarden via this(1, 1, 1, 1)

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        int resultHeight = r1.getHeight();
        System.out.println(resultHeight);

        int resultWidth = r1.getWidth();
        System.out.println(resultWidth);

        r1.grow(100); // hoogte en breedte worden elk 100 groter
        System.out.println(r1);
    }
}

/*
    Wat gebeurt er als je een negatieve waarde aan setHeight() of setWidth()
    geeft?
    - Dan wordt die waarde via Math.abs() automatisch positief gemaakt en
      daarna aan het veld toegekend.

    Kan je een toString()-methode toevoegen aan de klasse Rectangle en
    deze in RectangleApp gebruiken?
    - Ja, zie de @Override toString() in Rectangle; println gebruikt die.

    Voeg een grow(int d) methode-aanroep toe in RectangleApp en toon het
    effect.
    - Zie r1.grow(100) hierboven: de hoogte en de breedte worden vergroot.
*/
