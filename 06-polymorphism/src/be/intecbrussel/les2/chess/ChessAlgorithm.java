package be.intecbrussel.les2.chess;

import java.util.Random;

class ChessAlgorithm {
    private static ChessPlayer[] cp = ChessPlayer.values();
    private static Random random = new Random();

    final static ChessPlayer getColorForPlayer() {
        return cp[random.nextInt(cp.length)];
    }
}
