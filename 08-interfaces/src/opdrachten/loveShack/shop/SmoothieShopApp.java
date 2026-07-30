package opdrachten.loveShack.shop;

import opdrachten.loveShack.mixables.Food;

/** Demo: elk recept mixt zijn ingrediënten en toont de totale prijs. */
public class SmoothieShopApp {
    public static void main(String[] args) {
        for (SmoothieRecipe recept : SmoothieRecipe.values()) {
            System.out.println("== " + recept + " ==");
            for (Food ingredient : recept.getRecipe()) {
                ingredient.mix(); // via het Mixable-contract
            }
            System.out.println("Totaal: " + recept.getTotalPrice() + " EUR");
            System.out.println();
        }
    }
}
