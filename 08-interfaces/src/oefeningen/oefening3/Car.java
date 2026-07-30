package oefeningen.oefening3;

import java.util.Arrays;

/**
 * Car implementeert het volledige Vehicle-contract
 * (en dus ook Motor en Switch1).
 */
public class Car implements Vehicle {

    private boolean isOn = false;
    private boolean[] stateOfDoors = new boolean[doors]; // constante uit de interface

    public boolean isDoorOpen() {
        for (boolean door : stateOfDoors) {
            if (door) { // true betekent: deur staat open
                return true;
            }
        }
        return false;
    }

    @Override
    public void gas() {
        // rijden mag alleen met draaiende motor en alle deuren dicht
        if (isOn && !isDoorOpen())
            System.out.println("Let's go!");
        else
            System.out.println("The car can't drive. The engine is off or one of the doors is open.");
    }

    @Override
    public void toggleSwitch() {
        isOn = !isOn;
        System.out.println("Engine " + (isOn ? "on" : "off"));
    }

    @Override
    public void openDoor(int door) {
        stateOfDoors[door] = true;
        System.out.println("The door " + door + " just opened.");
    }

    @Override
    public void closeDoor(int door) {
        stateOfDoors[door] = false;
        System.out.println("The door " + door + " just closed.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "isOn=" + isOn +
                ", stateOfDoors=" + Arrays.toString(stateOfDoors) +
                '}';
    }
}
