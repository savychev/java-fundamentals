package extra;

/**
 * EXTRA — FUNCTIONELE INTERFACE: precies één abstracte methode.
 * Daardoor kan ze met een lambda geïmplementeerd worden (zie ExtraMainApp).
 * De annotatie laat de compiler bewaken dat het er één blijft.
 */
@FunctionalInterface
public interface Berekening {
    int bereken(int a, int b); // de enige abstracte methode
}
