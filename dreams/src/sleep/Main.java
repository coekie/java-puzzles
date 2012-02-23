package sleep;

import dream.Dream;

public class Main {
    public static void main(String[] args) {
        if (new Sleeper().dream(new Dream()) != 0) {
            // The goal is to reach this line
            System.out.println("Am I still dreaming?");
        }
    }
}
