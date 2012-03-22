package game;

public final class Game {

    private final Ball ball = new Ball();
    private volatile long score;

    public final class Ball extends Throwable {
        private volatile long caught;

        private Ball() {
        }

        public synchronized void caught() {
            if (caught++ < score++) {
                // The goal is to reach this line
                System.out.println("You cheated!");
            }
        }
    }

    public void play() throws Ball {
        throw ball;
    }
}
