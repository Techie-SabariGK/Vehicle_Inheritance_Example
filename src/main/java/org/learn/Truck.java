package org.learn;

public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, int container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                "} " + super.toString();
    }
}
