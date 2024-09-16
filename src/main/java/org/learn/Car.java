package org.learn;

public class Car extends Vehicle {

    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;
    
    public Car(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainmentSystem='" + entertainmentSystem + '\'' +
                '}' +  super.toString();
    }
}
