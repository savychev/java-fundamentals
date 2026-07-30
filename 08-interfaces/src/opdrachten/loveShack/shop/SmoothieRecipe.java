package opdrachten.loveShack.shop;

import opdrachten.loveShack.mixables.Food;
import opdrachten.loveShack.mixables.fruits.*;
import opdrachten.loveShack.mixables.vegetables.Celery;
import opdrachten.loveShack.mixables.vegetables.Spinach;

/**
 * Enum van vaste recepten. Elk recept is een lijst van Food-ingrediënten;
 * de totale prijs wordt één keer berekend in de constructor.
 */
public enum SmoothieRecipe {
    CITRUS(new Food[]{new Orange(1), new Orange(1), new Lemon(0.75)}),
    STRAWBERRY_DREAM(new Food[]{new Strawberry(2), new Orange(1), new Orange(1), new Banana(1.25)}),
    BANANA_SLIDE(new Food[]{new Banana(1.25), new Banana(1.25), new Orange(1)}),
    VEGGIE_SLURRY(new Food[]{new Banana(1.25), new Celery(1), new Spinach(1), new Apple(0.5)});

    private final Food[] recipe;
    private final double totalPrice;

    SmoothieRecipe(Food[] recipe) {
        this.recipe = recipe; // bugfix: het recept werd voorheen niet opgeslagen (NullPointerException)
        double som = 0;
        for (Food ingredient : recipe) {
            som += ingredient.getPricePerPiece(); // prijs = som van alle ingrediënten
        }
        this.totalPrice = som;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Food[] getRecipe() {
        return recipe;
    }
}
