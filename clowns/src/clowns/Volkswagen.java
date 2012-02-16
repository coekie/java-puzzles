package clowns;

import java.util.HashSet;
import java.util.Set;

public class Volkswagen {
    private static final int CAPACITY = 5;
    private Set<Clown> clowns = new HashSet<Clown>();

    public synchronized void add(Clown clown) {
        if (clowns.size() >= CAPACITY) {
            throw new IllegalStateException("I'm full");
        } else {
            clowns.add(clown);
        }
    }

    public synchronized void done() {
        if (clowns.size() == 20) {
            // The goal is to reach this line
            System.out.println("I'm a Volkswagen with 20 clowns!");
        }
    }
}
