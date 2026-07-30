package opdrachten.loveShack.mixables.vegetables;

public class Celery extends Vegetable {
    public Celery(double pricePerPiece) {
        super(1);
    }

    @Override
    public void mix() {
        System.out.println("Celery is pressed and added");
    }
}
