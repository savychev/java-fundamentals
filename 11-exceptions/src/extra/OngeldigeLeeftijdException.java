package extra;

/**
 * Eigen CHECKED exception: extends Exception.
 * (extends RuntimeException zou er een unchecked exception van maken.)
 */
public class OngeldigeLeeftijdException extends Exception {

    public OngeldigeLeeftijdException(String boodschap) {
        super(boodschap); // boodschap komt later uit e.getMessage()
    }
}
