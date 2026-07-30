package Opdracht2;

public class Opd3IfElseBruto {
    public static void main(String[] args) {
        double brutoLoon = 2500;
        double nettoLoon = 0;

        if (brutoLoon < 2000) {
            nettoLoon = brutoLoon - (brutoLoon / 100 * 27);
        }
        else if (brutoLoon > 3000) {
            nettoLoon = brutoLoon - (brutoLoon / 100 * 38);
        }
        else {
            nettoLoon = brutoLoon - (brutoLoon / 100 * 35);
        }

        System.out.println(nettoLoon);

    }
}