package be.intecbrussel.les1.Oefening4;

public class Oefening4_3 {
    public static void main(String[] args) {
        int a = 0; // first number
        int b = 60; // second number
        int randNumber;
        String evenOrOdd;
        String result = "";

        randNumber = (int) (Math.random() * 60) + 1;

        evenOrOdd = randNumber % 2 == 0 ? "even" : "odd";

        switch (evenOrOdd) {
            case "even":
                result = "The number "+randNumber+" is even.";
                break;
            case "odd":
                result = "The number "+randNumber+" is odd.";
        }


        System.out.println(result);
    }
}
