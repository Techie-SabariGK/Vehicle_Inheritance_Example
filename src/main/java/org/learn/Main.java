package org.learn;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol", 2, 2, 12,"LED", "Short");
        System.out.println(bike);
        Car car = new Car("Petrol", 4,4,30, "LED", "Power Steering", "BOSE", "AC", "NO", "Android" );
        System.out.println(car);
        Truck truck = new Truck("Diesal", 6,2,50,"CFL","Power Steering", "NO","NO",2000);
        System.out.println(truck);
    }
}
