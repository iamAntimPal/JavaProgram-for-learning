interface Vehicle {
     void start();
     void stop();
}

interface Car extends Vehicle {
     void drive();
}

// Extend the Vehicle interface with Bike interface
interface Bike extends Vehicle {
     void ride();
}

// Implement the Car interface in the CarImpl class
class my1 implements Car {
     @Override
     public void start() {
          System.out.println("Car started.");
     }

     @Override
     public void stop() {
          System.out.println("Car stopped.");
     }

     @Override
     public void drive() {
          System.out.println("Driving the car.");
     }
}

// Implement the Bike interface in the BikeImpl class
class my2 implements Bike {
     @Override
     public void start() {
          System.out.println("Bike started.");
     }

     @Override
     public void stop() {
          System.out.println("Bike stopped.");
     }

     @Override
     public void ride() {
          System.out.println("Riding the bike.");
     }
}

// Main class to demonstrate the usage of interfaces and implementations
public class car_inter {
     public static void main(String[] args) {
          my1 car = new my1();
          my2 bike = new my2();

          car.start();
          car.drive();
          car.stop();

          bike.start();
          bike.ride();
          bike.stop();
     }
}
