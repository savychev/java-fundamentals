package opdrachten.loveShack.mixables.fruits;

/** Concreet ingrediënt: krijgt zijn prijs mee en implementeert mix(). */
public class Apple extends Fruit {

    public Apple(double pricePerPiece) {
        super(pricePerPiece); // bugfix: de prijs werd voorheen genegeerd
    }

    @Override
    public void mix() {
        System.out.println("Apple is pressed and added");
    }
}
