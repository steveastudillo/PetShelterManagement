package org.example;

public class Rabbit extends Animal {

    public Rabbit(int id, String name, int age, String healthStatus) {
        super(id, name, age, healthStatus);
    }

    @Override
    public String getSpecies() {
        return "Rabbit";
    }
}