package be.intecbrussel.oefening6.oefening1;

public class MainApp {
    public static void main(String[] args) {
        Week[] weekArr = Week.values();
        for (Week day : weekArr){
            System.out.println(day + " at index " + day.ordinal());
        }
    }
}
