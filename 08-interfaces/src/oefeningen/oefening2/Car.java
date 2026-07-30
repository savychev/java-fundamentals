package oefeningen.oefening2;

public class Car implements Motor, Switch1 {
    public boolean isOn = false;

    @Override
    public void gas() {
        if (isOn)
            System.out.println("Engine is on and the car is riding.");
        else
            System.out.println("Engine is off.");
    }

    @Override
    public void toggleSwitch() {
        isOn = !isOn;
        System.out.println("Engine " + (isOn ? "on" : "off"));
    }
}
