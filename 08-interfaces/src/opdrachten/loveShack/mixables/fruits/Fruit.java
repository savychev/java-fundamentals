package opdrachten.loveShack.mixables.fruits;

import opdrachten.loveShack.mixables.Food;

/** Tussenlaag in de hiërarchie: al het fruit is Food (en dus Mixable). */
public abstract class Fruit extends Food {
    public Fruit(double pricePerPiece) {
        super(pricePerPiece);
    }
}
