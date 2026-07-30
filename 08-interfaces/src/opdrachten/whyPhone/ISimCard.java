package opdrachten.whyPhone;

/**
 * Interface met DEFAULT-methodes: de implementatie zit al in de interface,
 * dus een klasse die ISimCard implementeert hoeft niets te overriden.
 */
public interface ISimCard {

    default void startCall(String number) {
        System.out.println("Calling " + number); // bugfix: nummer werd genegeerd
    }

    default void endCall() {
        System.out.println("Call ended");
    }
}
