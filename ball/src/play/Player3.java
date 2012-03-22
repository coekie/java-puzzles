package play;

import java.io.*;

public class Player3 implements Serializable {

    public static void main(String[] args) throws Exception {
        byte[] bytes = ("\254\355\000\005sr\000\016game.Game$Ball\234w\306" +
                "\033V\232%\253\002\000\002J\000\006caughtL\000\006this$0t" +
                "\000\015Lplay/Player;xp\377\377\377\377\377\377\377\377sr" +
                "\000\013play.Player\351\337@6\255%\200\373\002\000\000xp")
                .getBytes("ISO-8859-1");

        ((game.Game.Ball) new ObjectInputStream(new ByteArrayInputStream(bytes))
                .readObject()).caught();
    }

    Object readResolve() {
        return new game.Game();
    }
}