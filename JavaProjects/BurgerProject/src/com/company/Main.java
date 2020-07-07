package com.company;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
	    HealthyBurger b = new HealthyBurger("Simple", "Simple", false, true, true, false, true);
        System.out.println(b.getPrice());

    }
}
