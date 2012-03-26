package creator;

import chicken.Chicken;
import chicken.Egg;

public class Creator {
    static class FirstEgg extends Egg {
        FirstEgg() {
            super(null);
        }

        @Override
        protected void finalize() {
            new Chicken(this).ask();
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            new FirstEgg();
        } catch (NullPointerException e) {
        }

        // there are ways to force garbage collection harder,
        // but this works good enough for me
        System.gc();
        System.runFinalization();
        Thread.sleep(1000);
    }
}
