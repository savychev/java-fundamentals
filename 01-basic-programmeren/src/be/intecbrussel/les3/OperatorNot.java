package be.intecbrussel.les3;

/** Les 3: de NIET-operator (!) — twee gelijkwaardige manieren om "niet gelijk aan" te schrijven. */
public class OperatorNot {
    public static void main(String[] args) {
        int num = 0;

        if (num != 0) { // != : niet gelijk aan
            System.out.println("Number is not equal to 0");
        }

        if (!(num == 0)) { // ! keert de hele voorwaarde om; zelfde betekenis als hierboven
            System.out.println("Number is not equal to 0");
        } else {
            System.out.println("Number is 0!");
        }
    }
}
