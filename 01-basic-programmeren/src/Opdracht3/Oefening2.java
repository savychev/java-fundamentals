package Opdracht3;

/** Oefening: kortingscategorie bepalen met geneste ternaire operatoren, korting berekenen met switch. */
public class Oefening2 {
    public static void main(String[] args) {
        double totalAmount = 100.0;
        double discount;

        // Geneste ternaire operator: de eerste voorwaarde die waar is, bepaalt de categorie
        int category = totalAmount >= 100.0 ? 1 :
                totalAmount >= 50.0 ? 2 :
                        totalAmount >= 25.0 ? 3 : 0;

        switch (category) {
            case 1:
                discount = totalAmount * 0.1; // 10% vanaf 100
                break;
            case 2:
                discount = totalAmount * 0.05; // 5% vanaf 50
                break;
            case 3:
                discount = totalAmount * 0.02; // 2% vanaf 25
                break;
            default:
                discount = 0.0;
        }
        System.out.println("Discount: " + discount);
    }
}
