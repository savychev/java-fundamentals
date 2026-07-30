package be.intecbrussel;

public class Auto {
    private String mark;
    private String model;
    private int speed;

    private Auto() {
    }

    public Auto(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public void getMessageCreation(){
        System.out.println("Auto is created!");
    }
}