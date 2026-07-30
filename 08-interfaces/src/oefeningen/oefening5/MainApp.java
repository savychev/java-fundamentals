package oefeningen.oefening5;

public class MainApp {
    public static void main(String[] args) {
        Battery duracel2a = new DuracelDoubleA();
        Battery duracel3a = new DuracelTripleA();
        Battery varta2a = new VartaDoubleA();

        Flashlight flashlight1 = new Flashlight(duracel2a);
        Flashlight flashlight2 = new Flashlight(duracel3a);
        Flashlight flashlight3 = new Flashlight(varta2a);
    }
}
