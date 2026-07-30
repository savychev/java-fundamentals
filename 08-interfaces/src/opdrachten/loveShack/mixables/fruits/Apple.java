package opdrachten.loveShack.mixables.fruits;

public class Apple extends Fruit {
    public Apple(double pricePerPiece) {
        super(0.5);
    }

    @Override
    public void mix() {
        System.out.println("Apple is pressed and added");
    }
}
