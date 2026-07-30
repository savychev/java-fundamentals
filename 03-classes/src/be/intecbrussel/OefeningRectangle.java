package be.intecbrussel;

/**
 * Eenvoudige oefenklasse: rechthoek met twee constructors,
 * getters/setters en berekende waarden (oppervlakte en omtrek).
 */
public class OefeningRectangle {
    int length;
    int width;
    int area;
    int perimeter;

    public OefeningRectangle() {
    }

    public OefeningRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // berekende waarde: telkens opnieuw uitgerekend uit lengte en breedte
    public int getArea() {
        area = this.length * this.width;
        return area;
    }

    public int getPerimeter() {
        perimeter = 2 * (this.length + this.width);
        return perimeter;
    }
}
