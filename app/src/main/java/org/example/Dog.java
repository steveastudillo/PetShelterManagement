package org.example;

public class Dog extends Animal {

    public Dog(int id, String name, int age, String healthStatus) {
        super(id, name, age, healthStatus);
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }
}