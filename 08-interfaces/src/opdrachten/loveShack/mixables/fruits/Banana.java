package opdrachten.loveShack.mixables.fruits;

/** Concreet ingrediënt: krijgt zijn prijs mee en implementeert mix(). */
public class Banana extends Fruit {

    public Banana(double pricePerPiece) {
        super(pricePerPiece); // bugfix: de prijs werd voorheen genegeerd
    }

    @Override
    public void mix() {
        System.out.println("Banana is pressed and added");
    }
}
