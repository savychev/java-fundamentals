package opdrachten.whyPhone;

/** Deelcontract: gps-functionaliteit. */
public interface IGPS {
    String locatie(double latitude, double longitude);

    void navigate();
}
