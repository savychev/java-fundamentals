package oefeningen.oefening3;

/**
 * Interface die twee andere interfaces samenvoegt en uitbreidt.
 * Velden in een interface zijn impliciet public static final (constanten).
 */
public interface Vehicle extends Motor, Switch1 {

    int doors = 5; // constante: impliciet public static final

    void openDoor(int door);
    void closeDoor(int door);
}
