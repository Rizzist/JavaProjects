package com.company;

public class Main {

    public static void main(String[] args) {
        Car holden = new Car();
        Car porche = new Car();
        porche.setDoors(4);
        porche.setModel("porche");
        holden.setModel("holden");
        System.out.println(porche.getModel());
        System.out.println(holden.getModel());
    }
}
