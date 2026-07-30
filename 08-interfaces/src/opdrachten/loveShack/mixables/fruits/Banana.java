package opdrachten.loveShack.mixables.fruits;

public class Banana extends Fruit {
    public Banana(double pricePerPiece) {
        super(1.25);
    }

    @Override
    public void mix() {
        System.out.println("Banana is pressed and added");
    }
}
