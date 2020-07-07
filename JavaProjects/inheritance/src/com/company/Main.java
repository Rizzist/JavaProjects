package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorki", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        System.out.println(dog.getWeight());
        dog.eat();
        System.out.println(dog.getWeight());
        dog.walk();
        dog.run();
    }
}
