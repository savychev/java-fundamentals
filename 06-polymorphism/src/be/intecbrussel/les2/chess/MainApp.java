package be.intecbrussel.les2.chess;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter player name: ");
        String namePlayer = scanner.nextLine();
        System.out.println("The player " + namePlayer + " has color: " + ChessAlgorithm.getColorForPlayer());
    }
}
