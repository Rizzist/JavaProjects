package com.company;

public class Car {
    private String name;
    private int wheels;
    private int doors;

    public Car(String name, int wheels, int doors) {
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void startEngine() {
        System.out.println("Engines on! Brr");
    }

    public void accelerate() {
        System.out.println("Accelerating car!!");
    }
}
