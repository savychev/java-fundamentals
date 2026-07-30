package opdrachten.loveShack.mixables.fruits;

public class Strawberry extends Fruit {
    public Strawberry(double pricePerPiece) {
        super(2);
    }

    @Override
    public void mix() {
        System.out.println("Strawberry is pressed and added");
    }
}
