package dream;

import sleep.Sleeper;

public class Dream {
    private static void doWait(Sleeper s) {
        try {
            s.wait(200);
        } catch (InterruptedException e) {
        }
    }

    public void dream(final Sleeper s) {
        new Thread() {
            public void run() {
                s.enter(new Dream() {
                    @Override
                    public void dream(Sleeper s) {
                        doWait(s);
                    }
                });
            }
        }.start();

        doWait(s);
    }
}
