package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String color;

    public Car() {
        //empty constructor call
        this(5);
    }

    public Car(int door) {

    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        String vmodel = model.toLowerCase();
        if (vmodel.equals("porche")) {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

}
