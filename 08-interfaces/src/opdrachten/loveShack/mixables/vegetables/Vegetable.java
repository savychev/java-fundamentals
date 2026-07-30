package opdrachten.loveShack.mixables.vegetables;

import opdrachten.loveShack.mixables.Food;

/** Tussenlaag in de hiërarchie: alle groenten zijn Food (en dus Mixable). */
public abstract class Vegetable extends Food {
    public Vegetable(double pricePerPiece) {
        super(pricePerPiece);
    }
}
