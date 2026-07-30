package be.intecbrussel.opdracht1;

/**
 * Demo: elk autotype gebruikt zijn eigen accelerate()-implementatie,
 * maar de gemeenschappelijke velden en toString() komen uit Car.
 */
public class MainApp {
    public static void main(String[] args) {
        SUV suv = new SUV();
        suv.setColor("red");
        suv.setHp(250);
        suv.accelerate(50); // 50 + 250/100 = 52
        System.out.println(suv);

        Cabrio cabrio = new Cabrio();
        cabrio.setColor("yellow");
        cabrio.setHp(200);
        cabrio.accelerate(50); // geerfde versie van Car
        System.out.println(cabrio);

        ElectricCar electricCar = new ElectricCar();
        electricCar.setColor("green");
        electricCar.setBattery(60);
        electricCar.accelerate(50); // eigen versie: op basis van de batterij
        System.out.println(electricCar);
    }
}
