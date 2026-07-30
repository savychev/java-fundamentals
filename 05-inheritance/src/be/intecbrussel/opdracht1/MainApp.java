package be.intecbrussel.opdracht1;

public class MainApp {
    public static void main(String[] args) {
        SUV suv = new SUV();
        suv.setColor("red");
        suv.setHp(250);
        suv.accelerate(50);
        System.out.println(suv.toString());

        Cabrio cabrio = new Cabrio();
        cabrio.setColor("yellow");
        cabrio.setHp(200);
        cabrio.accelerate(50);
        System.out.println(cabrio.toString());

        ElectricCar electricCar = new ElectricCar();
        electricCar.setColor("green");
        electricCar.setBattery(60);
        electricCar.accelerate(50);
        System.out.println(electricCar.toString());
    }
}
