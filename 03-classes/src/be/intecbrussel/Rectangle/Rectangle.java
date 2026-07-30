package be.intecbrussel.Rectangle;

/**
 * Rechthoek met vier constructors (incl. copy-constructor), setters met
 * validatie (Math.abs) en een eigen toString(). De no-arg constructor
 * delegeert via this(...) naar de volledige constructor.
 */
public class Rectangle {
    private int height;
    private int width;
    private int xPos;
    private int yPos;

    // constructor-chaining: delegeert naar de constructor met 4 parameters
    public Rectangle() {
        this(1, 1, 1, 1);
    }

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
        setXPos(1);
        setYPos(1);
    }

    public Rectangle(int height, int width, int xPos, int yPos) {
        setHeight(height);
        setWidth(width);
        setXPos(xPos);
        setYPos(yPos);
    }

    // copy-constructor: nieuwe rechthoek met dezelfde waarden
    public Rectangle(Rectangle obj) {
        setHeight(obj.height);
        setWidth(obj.width);
        setXPos(obj.xPos);
        setYPos(obj.yPos);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    // validatie: een negatieve waarde wordt automatisch positief gemaakt
    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void grow(int value) {
        if (value > 0) { // enkel groeien, niet krimpen
            this.height += value;
            this.width += value;
        }
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight()); // omtrek = 2 * (b + h)
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
