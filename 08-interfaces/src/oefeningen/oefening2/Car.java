package oefeningen.oefening2;

/**
 * Eén klasse, twee interfaces: Car combineert de contracten
 * Motor en Switch1 (meervoudige implementatie).
 */
public class Car implements Motor, Switch1 {

    private boolean isOn = false; // toestand hoort privé te zijn (encapsulatie)

    @Override
    public void gas() {
        if (isOn)
            System.out.println("Engine is on and the car is riding.");
        else
            System.out.println("Engine is off.");
    }

    @Override
    public void toggleSwitch() {
        isOn = !isOn; // toestand omklappen
        System.out.println("Engine " + (isOn ? "on" : "off"));
    }
}
