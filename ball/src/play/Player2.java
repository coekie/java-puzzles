package play;

import java.io.*;

public class Player2 {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(new play.Game().new Ball());
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInput in = new ObjectInputStream(bis) {
            @Override
            protected Class<?> resolveClass(ObjectStreamClass desc)
                    throws IOException, ClassNotFoundException {
                if (desc.getName().equals("play.Game$Ball")) {
                    return game.Game.Ball.class;
                }
                return super.resolveClass(desc);
            }
        };
        game.Game.Ball ball = (game.Game.Ball) in.readObject();

        ball.caught();
    }

}

// must be called Game for the "resolveClass" to be allowed
class Game implements Serializable {
    public final class Ball implements Serializable {
        final static long serialVersionUID = -7172046060844866133L;

        private long caught = -1;
    }

    Object readResolve() {
        return new game.Game();
    }
}