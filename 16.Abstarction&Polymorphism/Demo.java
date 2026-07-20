public class Demo {
    public static void main(String[] args) {

        Car car = new FuelCar();

        car.start();
        car.accelerate();
        car.brake();
    }
}

abstract class Car {

    void start() {
        System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {

    @Override
    void accelerate() {
        System.out.println("Fuel car is Accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel car is stopping");
    }
}

class ElectricCar extends Car {

    @Override
    void accelerate() {
        System.out.println("Electric car is Accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is stopping");
    }
}