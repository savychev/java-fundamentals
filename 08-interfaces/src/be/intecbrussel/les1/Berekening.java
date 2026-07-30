package be.intecbrussel.les1;

/**
 * FUNCTIONELE INTERFACE: precies één abstracte methode.
 * Daardoor kan ze met een lambda geïmplementeerd worden (zie BetaalbaarMainApp).
 * De annotatie laat de compiler bewaken dat het er één blijft.
 */
@FunctionalInterface
public interface Berekening {
    int bereken(int a, int b); // de enige abstracte methode
}
