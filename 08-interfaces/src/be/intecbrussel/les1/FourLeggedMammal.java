package be.intecbrussel.les1;

/**
 * Anders dan bij klassen mag een interface MEERDERE interfaces
 * tegelijk uitbreiden (meervoudige overerving van contracten).
 */
public interface FourLeggedMammal extends Animal, Hunter {
    void walkWithFourLegs();
}
