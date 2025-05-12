package com.pluralsight;

public class Moped extends Vehicle {
    @Override
    public String toString() {
        return "Moped { " +
                "color='" + color + '\'' +
                ", numberOfPassengers= " + numberOfPassengers +
                ", cargoCapacity= " + cargoCapacity +
                ", fuelCapacity= " + fuelCapacity +
                '}';
    }

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);


    }
}
