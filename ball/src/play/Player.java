package play;

import game.Game;

public class Player {
    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i < 3; i++) {
            try {
                game.play();
            } catch (Game.Ball ball) {
                ball.caught();
            }
        }
    }
}
