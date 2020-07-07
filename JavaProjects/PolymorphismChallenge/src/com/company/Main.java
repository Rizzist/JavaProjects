package com.company;

public class Main {

    public static void main(String[] args) {
        Car honda = new Car("Honda", 4, 2);
        Car h1 = honda;
        Car civic = new Car(h1.getName(), h1.getWheels(), h1.getDoors()) {
            private Car h = h1;

            @Override
            public void accelerate() {
                super.accelerate();
                System.out.println("Civic going up");
            }
        };
        civic.startEngine();
        civic.accelerate();

    }
}
