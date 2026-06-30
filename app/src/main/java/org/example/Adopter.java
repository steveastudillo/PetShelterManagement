package org.example;

public class Adopter {

    private String name;
    private AnimalType preferredAnimal;

    public Adopter(String name, AnimalType preferredAnimal) {
        this.name = name;
        this.preferredAnimal = preferredAnimal;
    }

    public String getName() {
        return name;
    }

    public AnimalType getPreferredAnimal() {
        return preferredAnimal;
    }

    @Override
    public String toString() {
        return name + " prefers " + preferredAnimal;
    }
}