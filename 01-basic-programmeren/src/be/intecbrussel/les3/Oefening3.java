package be.intecbrussel.les3;

public class Oefening3 {
    public static void main(String[] args) {
        String month = "February";
        int daysCount = 0;

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "Augustus":
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
                daysCount = 28;
                break;
        }

        System.out.println(daysCount);
    }
}
