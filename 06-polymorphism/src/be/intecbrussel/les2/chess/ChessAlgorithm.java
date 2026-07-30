package be.intecbrussel.les2.chess;

import java.util.Random;

/**
 * Kiest willekeurig een kleur; final methode kan niet overschreven worden.
 */
class ChessAlgorithm {
    private static ChessPlayer[] cp = ChessPlayer.values();
    private static Random random = new Random();

    // final: subklassen mogen deze methode niet overschrijven
    static final ChessPlayer getColorForPlayer() {
        return cp[random.nextInt(cp.length)];
    }
}
