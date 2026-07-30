package opdrachten.whyPhone;

/**
 * Simpele telefoon: implementeert maar twee contracten.
 * ISimCard levert zijn default-methodes kant-en-klaar,
 * dus alleen IRadio moet hier ingevuld worden.
 */
public class DummyPhone implements ISimCard, IRadio {

    @Override
    public void playChannel(double fm) {
        System.out.println("DummyPhone: Playing FM " + fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("DummyPhone: Changing to FM " + fm);
    }
}
