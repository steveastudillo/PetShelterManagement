package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnimalFactoryTest {

    @Test
    public void createDogTest() {

        Animal dog = AnimalFactory.createAnimal(
                AnimalType.DOG,
                1,
                "Buddy",
                3,
                "Healthy");

        assertTrue(dog instanceof Dog);
        assertEquals("Dog", dog.getSpecies());
    }

    @Test
    public void createCatTest() {

        Animal cat = AnimalFactory.createAnimal(
                AnimalType.CAT,
                2,
                "Luna",
                2,
                "Healthy");

        assertTrue(cat instanceof Cat);
        assertEquals("Cat", cat.getSpecies());
    }

    @Test
    public void createRabbitTest() {

        Animal rabbit = AnimalFactory.createAnimal(
                AnimalType.RABBIT,
                3,
                "Coco",
                1,
                "Healthy");

        assertTrue(rabbit instanceof Rabbit);
        assertEquals("Rabbit", rabbit.getSpecies());
    }
}