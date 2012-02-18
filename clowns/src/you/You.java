package you;

import clowns.Clown;
import clowns.Volkswagen;

public class You {
    static int counter = 0;
    static Volkswagen vw = new Volkswagen();

    public static void main(String args[]) {
        vw.add(new RecursiveClown());
        vw.done();
    }

    static class RecursiveClown extends Clown {
        public int hashCode() {
            if (++counter < 20) {
                vw.add(new RecursiveClown());
            }
            return super.hashCode();
        }
    }
}
