package com.pluralsight;
public class Vehicle {
    protected String color;
    protected int numberOfPassengers;
    protected int cargoCapacity;
    protected int fuelCapacity;

    // Constructor
    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }


    // Getters and Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public int getCargoCapacity() { return cargoCapacity; }
    public void setCargoCapacity(int cargoCapacity) { this.cargoCapacity = cargoCapacity; }

    public int getFuelCapacity() { return fuelCapacity; }
    public void setFuelCapacity(int fuelCapacity) { this.fuelCapacity = fuelCapacity; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Vehicle { " + // get class get simple name gets class name without package.className
                "color='" + color + '\'' +
                ", numberOfPassengers= " + numberOfPassengers +
                ", cargoCapacity= " + cargoCapacity +
                ", fuelCapacity= " + fuelCapacity +
                '}';
    }
}
