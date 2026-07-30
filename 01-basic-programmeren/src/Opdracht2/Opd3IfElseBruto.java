package Opdracht2;

/** Oefening: nettoloon berekenen uit brutoloon met if / else-if / else (belastingschijven). */
public class Opd3IfElseBruto {
    public static void main(String[] args) {
        double brutoLoon = 2500;
        double nettoLoon;

        if (brutoLoon < 2000) {
            nettoLoon = brutoLoon - (brutoLoon / 100 * 27); // 27% inhouding
        } else if (brutoLoon > 3000) {
            nettoLoon = brutoLoon - (brutoLoon / 100 * 38); // 38% inhouding
        } else {
            nettoLoon = brutoLoon - (brutoLoon / 100 * 35); // 35% voor de middenschijf
        }

        System.out.println(nettoLoon);
    }
}
