package be.intecbrussel.les3;

/** Les 3: switch met break per case en een default voor onbekende waarden. */
public class StatementSwitch {
    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // zonder break zou de uitvoering doorlopen naar de volgende case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Day number doesn't exist");
        }
    }
}
