package oefeningen.oefening5;

/** Demo: dezelfde zaklamp werkt met elk batterijmerk. */
public class MainApp {
    public static void main(String[] args) {
        Battery duracell2a = new DuracellDoubleA();
        Battery duracell3a = new DuracellTripleA();
        Battery varta2a = new VartaDoubleA();

        Flashlight flashlight1 = new Flashlight(duracell2a);
        Flashlight flashlight2 = new Flashlight(duracell3a);
        Flashlight flashlight3 = new Flashlight(varta2a);
    }
}
