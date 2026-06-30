package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnimalStateTest {

    @Test
    public void animalStartsInIntakeState() {

        Animal dog = AnimalFactory.createAnimal(
                AnimalType.DOG,
                1,
                "Buddy",
                3,
                "Healthy");

        assertEquals("Intake",
                dog.getCurrentState().getStatus());
    }

    @Test
    public void stateChangesToAvailable() {

        Animal dog = AnimalFactory.createAnimal(
                AnimalType.DOG,
                1,
                "Buddy",
                3,
                "Healthy");

        dog.setCurrentState(new AvailableState());

        assertEquals("Available",
                dog.getCurrentState().getStatus());
    }

    @Test
    public void stateChangesToAdopted() {

        Animal dog = AnimalFactory.createAnimal(
                AnimalType.DOG,
                1,
                "Buddy",
                3,
                "Healthy");

        dog.setCurrentState(new AdoptedState());

        assertEquals("Adopted",
                dog.getCurrentState().getStatus());
    }
}