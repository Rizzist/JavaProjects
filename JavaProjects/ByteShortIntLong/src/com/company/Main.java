package com.company;

public class Main {

    public static void main(String[] args) {
        int mv = 10000;
        int mumin = Integer.MIN_VALUE;
        int mumax = Integer.MAX_VALUE;
        System.out.println("Integer Min value: " + mumin);
        System.out.println("Integer Max value: " + mumax);

        byte minbyte = Byte.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        System.out.println("Byte Min value: " + minbyte);
        System.out.println("Byte Max value: " + maxbyte);

        short minshort = Short.MIN_VALUE;
        short maxshort = Short.MAX_VALUE;
        System.out.println("short Min value: " + minshort);
        System.out.println("short Max value: " + maxshort);

        long minlong = Long.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        System.out.println("long Min value: " + minlong);
        System.out.println("long Max value: " + maxlong);

        int myTotal = (mumin/2);
        byte mynewByte = (byte) (minbyte/2);

        byte a = 120;
        short b = 30000;
        int c = 200000000;
        long d = 50000L + 10*(a+b+c);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("d is " + d);
    }
}
