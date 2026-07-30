package Opdracht3;

public class Oefening2 {
    public static void main(String[] args) {
        double totalAmount = 100.0;
        double discount = 0.0;

        int category = totalAmount >= 100.0 ? 1 :
                totalAmount >= 50.0 ? 2 :
                        totalAmount >= 25.0 ? 3 : 0;

        switch (category) {
            case 1:
                discount = totalAmount * 0.1;
                break;
            case 2:
                discount = totalAmount * 0.05;
                break;
            case 3:
                discount = totalAmount * 0.02;
                break;
            default:
                discount = 0.0;
        }
        System.out.println("Discount: " + discount);
    }
}
