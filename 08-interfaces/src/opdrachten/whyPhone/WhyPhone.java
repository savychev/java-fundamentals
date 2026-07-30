package opdrachten.whyPhone;

public class WhyPhone extends SmartPhone {
    private final String COLOR;

    public WhyPhone(double PRICE, String BRAND, String COLOR) {
        super(PRICE, BRAND);
        this.COLOR = COLOR;
    }

    public String getCOLOR() {
        return COLOR;
    }
}
