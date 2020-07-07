package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1+2; //=3
        boolean isCar = true;
        boolean wascar = (isCar==true) ? true : false;

        double d = 20.00;
        double v = 80.00;
        double c = d + v*100.00;
        double r = c % 40.00;
        boolean sult = (r==0) ? true : false;

        System.out.println(d + " " + v + " " + c + " " + r);
        System.out.println(sult);
        if (!sult) {
            System.out.println("Got some remainder!!");
        }
    }
}
