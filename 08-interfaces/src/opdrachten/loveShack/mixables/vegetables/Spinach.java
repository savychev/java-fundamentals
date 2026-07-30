package opdrachten.loveShack.mixables.vegetables;

/** Concreet ingrediënt: krijgt zijn prijs mee en implementeert mix(). */
public class Spinach extends Vegetable {

    public Spinach(double pricePerPiece) {
        super(pricePerPiece); // bugfix: de prijs werd voorheen genegeerd
    }

    @Override
    public void mix() {
        System.out.println("Spinach is pressed and added");
    }
}
