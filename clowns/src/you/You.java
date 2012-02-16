package you;

import clowns.Clown;
import clowns.Volkswagen;

public class You {
    public static void main(String args[]) {
        // TODO put 20 clowns into a Volkswagen
        Volkswagen vw = new Volkswagen();
        for (int i = 0; i < 20; i++) {
            vw.add(new Clown());
        }
        vw.done();
    }
}
