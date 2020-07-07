package com.company;

public class Hamburger extends Burger{
    private String rolltype;
    private double price = 5.00;

    public Hamburger(String rolltype, String meat, boolean lettuce, boolean tomato, boolean carrot) {
        super(rolltype, meat, lettuce, tomato, carrot);
        this.rolltype = rolltype;
    }

    public String getPrice() {
        return String.valueOf(price);
    }
}
