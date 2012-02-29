package car;

public final class Car {
    private static final int MAX_SPEED = 100;

    private int speed = 0;

    public synchronized void accelerate(int acceleration) {
        if (acceleration > MAX_SPEED - speed)
            crash();
        else
            speed += acceleration;
    }

    public synchronized void crash() {
        speed = 0;
    }

    public synchronized void vroom() {
        if (speed > MAX_SPEED * 10) {
            // The goal is to reach this line
            System.out.println("Vroom!");
        }
    }
}