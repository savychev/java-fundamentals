# 🐍 Ervaringsweek — Snake in Swing

A playable **Snake** game built with plain Java Swing during the practice week (*ervaringsweek*) — no external libraries, one source file, arrow keys to steer, eat apples, don't bite yourself.

> 🇳🇱 Een speelbaar **Snake**-spel gebouwd met pure Java Swing tijdens de ervaringsweek — geen externe bibliotheken, één bronbestand, pijltjestoetsen om te sturen, appels eten en niet in je eigen staart bijten.

## ▶️ Compile & run

From the `ervaringsweek` folder:

```bash
javac -d out src/be/intecbrussel/SnakeGame.java
java -cp out be.intecbrussel.SnakeGame
```

A 600×600 window opens; the snake starts moving to the right immediately. Steer with the **arrow keys**. Each apple grows the snake by one segment and adds a point; hitting a wall or your own body ends the game.

## 🧠 What it demonstrates

- **Swing basics** — `JFrame` as the window, a custom `JPanel` (`GamePanel`) doing all the drawing by overriding `paintComponent(Graphics)`.
- **`javax.swing.Timer` as game loop** — fires an `ActionEvent` every 75 ms; each tick moves the snake, checks apple/collisions, and calls `repaint()`. No manual threads needed, and it runs safely on the Event Dispatch Thread.
- **`KeyListener`** — arrow-key handling with a guard so the snake can never reverse into itself (`if (direction != 'R') direction = 'L'`).
- **Grid-based game state** — the board is a grid of 25-pixel units; the snake body lives in two parallel `int[]` arrays (`x`, `y`) that shift one position per tick, head written last.
- **Two collaborating classes in one file** — the public `SnakeGame` launcher plus the package-private `GamePanel` that implements `ActionListener` and `KeyListener` itself.
- **Collision & score logic** — wall and self-collision detection, score rendering with `FontMetrics` to center text, and a game-over screen.
