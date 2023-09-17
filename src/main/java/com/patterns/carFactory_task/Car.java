package com.patterns.carFactory_task;

abstract public class Car {

    private double engineCapacity;
    private String fuelType;
    private int yearOfManufacture;
    private SteeringWheelPosition steeringWheelPosition;

    protected Car(double engineCapacity, String fuelType, int yearOfManufacture, SteeringWheelPosition steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfManufacture = yearOfManufacture;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
