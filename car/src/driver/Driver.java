package driver;

import car.Car;

public class Driver {
    public static void main(String args[]) {
        Car car = new Car();
        car.accelerate(-1);
        car.accelerate(Integer.MIN_VALUE);
        car.vroom();
    }
}