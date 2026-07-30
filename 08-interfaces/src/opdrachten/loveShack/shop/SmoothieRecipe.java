package opdrachten.loveShack.shop;

import opdrachten.loveShack.mixables.Food;
import opdrachten.loveShack.mixables.fruits.*;
import opdrachten.loveShack.mixables.vegetables.Celery;
import opdrachten.loveShack.mixables.vegetables.Spinache;

public enum SmoothieRecipe {
    CITRUS(new Food[]{new Orange(1), new Orange(1), new Lemon(0.75)}),
    STRAWBERRY_DREAM(new Food[]{new Strawberry(1), new Orange(1), new Orange(1), new Banana(1)}),
    BANA_SLIDE(new Food[]{new Banana(1.25), new Banana(1.25), new Orange(1)}),
    VEGIE_SLURRY(new Food[]{new Banana(1.25), new Celery(1), new Spinache(1), new Apple(1)});

    private double totalPrice;
    private Food[] recipe;

    SmoothieRecipe(Food[] recipe) {
    }

    public double getTotalPrice() {
        Food[] recipe = getRecipe();

        for (Food ingredient :  recipe){
            System.out.println(ingredient);
        }

        return totalPrice;
    }

    public Food[] getRecipe() {
        return recipe;
    }

    public void setRecipe(Food[] recipe) {

        this.recipe = recipe;
    }
}
