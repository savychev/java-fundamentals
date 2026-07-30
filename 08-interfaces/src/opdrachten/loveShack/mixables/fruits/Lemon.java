package opdrachten.loveShack.mixables.fruits;

/** Concreet ingrediënt: krijgt zijn prijs mee en implementeert mix(). */
public class Lemon extends Fruit {

    public Lemon(double pricePerPiece) {
        super(pricePerPiece); // bugfix: de prijs werd voorheen genegeerd
    }

    @Override
    public void mix() {
        System.out.println("Lemon is pressed and added");
    }
}
