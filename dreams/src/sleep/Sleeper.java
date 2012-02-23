package sleep;

import dream.Dream;

public class Sleeper {
    private int level;

    public synchronized int dream(Dream dream) {
        level++;
        try {
            dream.dream(this);
        } finally {
            level--;
        }
        return level;
    }
}
