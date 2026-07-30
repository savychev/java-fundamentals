package be.intecbrussel.oefening4;

public class Oefening3 {
    public static void main(String[] args) {
        String[] myArr = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};

        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i].equals(myArr[j])) {
                    System.out.println("Dubbel: " + myArr[i]);
                    break;
                }
            }
        }
    }
}
