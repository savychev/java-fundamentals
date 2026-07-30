package be.intecbrussel.les1;

public class Car extends Vehicle {
    private String brandName = "Audi";

    public String getBrandName() {
        return brandName;
    }

    public Car() {
        super();
        System.out.println("Car class constructor");
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void honk() {
        System.out.println("Tuut tuuut!");
    }

    public void sound(){
        super.honk();
    }
}