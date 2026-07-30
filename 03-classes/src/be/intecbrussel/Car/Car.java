package be.intecbrussel.Car;

import java.util.Random;

public class Car {
    private static int numberCars; // a static variable that stores the number of cars

    // default values
    private final String defaultColor = "white";
    private final int defaultSpeed = 120;
    private final int defaultPower = 150;

    private String color;
    private int maxSpeed;
    private int maxPower;
    private String driverName = "Unknown";
    private boolean toggleLights;

    private int currentSpeed;

    public Car() {
        setColor(this.defaultColor);
        setMaxSpeed(this.defaultSpeed);
        setMaxPower(this.defaultPower);
        counterCars();
    }

    public Car(String color) {
        setColor(color);
        setMaxSpeed(this.defaultSpeed);
        setMaxPower(this.defaultPower);
        counterCars();
    }

    public Car(String color, int speed) {
        setColor(color);
        setMaxSpeed(speed);
        setMaxPower(this.defaultPower);
        counterCars();
    }

    public Car(String color, int speed, int power) {
        setColor(color);
        setMaxSpeed(speed);
        setMaxPower(power);
        counterCars();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public static int getNumberCars() {
        return numberCars;
    }

    public static void setNumberCars(int numberCars) {
        Car.numberCars = numberCars;
    }

    public static void counterCars() {
        Car.numberCars++;
    }

    public void speedUp() {
        this.currentSpeed += 5;
    }

    public void slowDown() {
        this.currentSpeed -= 5;
    }

    public void repaint(String newColor) {
        setColor(newColor);
    }

    public void repair() {
        Random random = new Random();
        int min = 100;
        int max = 300;
        int randomNumber = random.nextInt(min, max + 1);
        System.out.println("Repair costs " + randomNumber + " euros.");
    }

    public void toggleLights() {
        String result;

        if (this.toggleLights) {
            result = "The lights are OFF now.";
            this.toggleLights = false;
        } else {
            result = "The lights are ON now.";
            this.toggleLights = true;
        }

        System.out.println(result);
    }

    public void assignDriver(String driverName) {
        if (driverName.trim().length() >= 5) {
            this.driverName = driverName;
        } else {
            System.out.println("Not allowed.");
        }
    }

    public String generateLicensePlate() {
        Random random = new Random();

        String letters = this.driverName.substring(0, 3).toUpperCase();
        int nummer = random.nextInt(100, 999 + 1);

       return letters + "-" + nummer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxPower=" + maxPower +
                '}';
    }
}