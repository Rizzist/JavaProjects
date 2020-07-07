package com.company;

public class Burger {
    private String rolltype;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;

    public Burger(String rolltype, String meat, boolean lettuce, boolean tomato, boolean carrot) {
        this.rolltype = rolltype;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }
}
