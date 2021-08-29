package com.sample;

public class Vehicle {

    public String vehicleType;
    public int capacity;
    public String fuelType;
    public float mileage;

    public Vehicle() {

    }

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;

    }

    public Vehicle(String vehicleType, int capacity, String fuelType) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.fuelType = fuelType;

    }

    public Vehicle(String vehicleType, int capacity, String fuelType, float mileage) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }


}
