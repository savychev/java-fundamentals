package oefeningen.oefening3;

public interface Vehicle extends Motor, Switch1 {
    int doors = 5;

    void openDoor (int door);
    void closeDoor (int door);

}
