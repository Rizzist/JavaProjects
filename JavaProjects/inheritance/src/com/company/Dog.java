package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String fur;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String fur) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.fur = fur;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public void eat() {
        System.out.println("Dog are bro");
        super.eat();
    }

    public void walk() {
        System.out.println("walking");
        move(1);
    }

    public void run() {
        System.out.println("running");
        move(4);
    }
}
