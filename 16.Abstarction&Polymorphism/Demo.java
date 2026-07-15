public class Demo{
    public static void main (String[] args) {
        Car car = new FuleCar();
        car.start();
        car.accelearte();
        car.brake();
    }
}

abstract class Car {
    void start(){
        System.outt.println("Car Started")
    }

abstract void accelerate();

abstract void break();

}

class FuleCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fule car is Accelerate")
    }
    
    void break(){
        System.out.println("Fule car is stopping")

    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric car is Accelerate")
    }
    
    void break(){
        System.out.println("Electric car is stopping")
    }
}