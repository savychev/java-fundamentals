package be.intecbrussel.les1;

/**
 * Implementatie die de default-methode gewoon overneemt:
 * alleen de abstracte methode moet ingevuld worden.
 */
public class Bankkaart implements Betaalbaar {

    private double saldo;

    public Bankkaart(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double bedrag() {
        return saldo;
    }
}
