package org.example;

public class AnimalFactory {

    private AnimalFactory() {
    }
    public static Animal createAnimal(
            AnimalType type,
            int id,
            String name,
            int age,
            String healthStatus) {

        if (type == AnimalType.DOG) {
            return new Dog(id, name, age, healthStatus);
        }

        if (type == AnimalType.CAT) {
            return new Cat(id, name, age, healthStatus);
        }

        if (type == AnimalType.RABBIT) {
            return new Rabbit(id, name, age, healthStatus);
        }

        throw new IllegalArgumentException("Unknown animal type.");
    }
}