package driver;

import car.Car;

public class Driver {
    static Car car = new Car();
    static int a = 0;

    public static void main(String args[]) {
        recurse();
        car.vroom();
    }

    static void recurse() {
        try {
            recurse(); // recurse without the car
        } catch (StackOverflowError e) {
            // when we've hit the limit of the stack, just go back out
        }
        if (a++ == 10) { // after taking 10 steps back
            recurse2(); // recurse with the car
        }
    }

    static void recurse2() {
        car.accelerate(1001);
        recurse2();
    }
}