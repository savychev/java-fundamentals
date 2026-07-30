package opdrachten.loveShack.mixables.vegetables;

/** Concreet ingrediënt: krijgt zijn prijs mee en implementeert mix(). */
public class Celery extends Vegetable {

    public Celery(double pricePerPiece) {
        super(pricePerPiece); // bugfix: de prijs werd voorheen genegeerd
    }

    @Override
    public void mix() {
        System.out.println("Celery is pressed and added");
    }
}
