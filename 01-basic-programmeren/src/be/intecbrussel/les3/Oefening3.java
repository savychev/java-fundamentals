package be.intecbrussel.les3;

/** Oefening: aantal dagen per maand — meerdere case-labels delen bewust één blok (fall-through). */
public class Oefening3 {
    public static void main(String[] args) {
        String month = "February";
        int daysCount = 0;

        switch (month) {
            // Alle maanden met 31 dagen delen hetzelfde blok
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                daysCount = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                daysCount = 30;
                break;
            case "February":
                daysCount = 28; // schrikkeljaren buiten beschouwing gelaten
                break;
        }

        System.out.println(daysCount);
    }
}
