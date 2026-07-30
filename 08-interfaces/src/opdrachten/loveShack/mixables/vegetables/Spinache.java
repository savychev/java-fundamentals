package opdrachten.loveShack.mixables.vegetables;

public class Spinache extends Vegetable {
    public Spinache(double pricePerPiece) {
        super(1.25);
    }

    @Override
    public void mix() {
        System.out.println("Spinache is pressed and added");
    }
}
