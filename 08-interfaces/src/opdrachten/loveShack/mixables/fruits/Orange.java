package opdrachten.loveShack.mixables.fruits;

/** Concreet ingrediënt: krijgt zijn prijs mee en implementeert mix(). */
public class Orange extends Fruit {

    public Orange(double pricePerPiece) {
        super(pricePerPiece); // bugfix: de prijs werd voorheen genegeerd
    }

    @Override
    public void mix() {
        System.out.println("Orange is pressed and added");
    }
}
