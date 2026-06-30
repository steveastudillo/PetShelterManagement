package org.example;

public class Cat extends Animal {

    public Cat(int id, String name, int age, String healthStatus) {
        super(id, name, age, healthStatus);
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }
}