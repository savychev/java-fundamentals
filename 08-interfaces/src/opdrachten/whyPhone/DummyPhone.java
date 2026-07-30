package opdrachten.whyPhone;

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
