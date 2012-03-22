package play;

import game.Game;
import game.Game.Ball;

import java.io.*;

public class Player implements Serializable {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(new Player().new Ba());
        byte[] bytes = new String(bos.toByteArray(), "ISO-8859-1")
                .replace("play.Player$Ba", "game.Game$Ball")
                .getBytes("ISO-8859-1");
        Ball ball = (Ball) new ObjectInputStream(new ByteArrayInputStream(bytes))
                .readObject();
        ball.caught();
    }

    class Ba implements Serializable {
        static final long serialVersionUID = -7172046060844866133L;

        private long caught = -1;
    }

    Object readResolve() {
        return new Game();
    }
}