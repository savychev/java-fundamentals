package opdrachten.whyPhone;

/** Concreet telefoonmodel: erft alle contract-implementaties van SmartPhone. */
public class WhyPhone extends SmartPhone {

    private final String COLOR;

    public WhyPhone(double price, String brand, String color) {
        super(price, brand);
        this.COLOR = color;
    }

    public String getColor() {
        return COLOR;
    }
}
