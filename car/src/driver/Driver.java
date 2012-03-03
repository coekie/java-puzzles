package driver;

import car.Car;

public class Driver {
    public static void main(String args[]) {
        // TODO break the speed limit
        Car car = new Car();
        car.accelerate(1001);
        car.vroom();
    }
}