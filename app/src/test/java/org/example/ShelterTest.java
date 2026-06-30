package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShelterTest {

    @Test
    public void shelterStartsWithFiveAnimals() {

        Shelter shelter = new Shelter();

        shelter.initializeAnimals();

        assertEquals(5, shelter.getAnimals().size());
    }
    @Test
    public void dayTwoAddsRocky() {
        Shelter shelter = new Shelter();
        shelter.initializeAnimals();
        shelter.initializeStaff();
        shelter.initializeAdopters();
        shelter.processDay(2);
        assertEquals(6, shelter.getAnimals().size());
    }
    @Test
    public void dayThreeSetsBuddyPending() {
        Shelter shelter = new Shelter();
        shelter.initializeAnimals();
        shelter.initializeStaff();
        shelter.initializeAdopters();
        shelter.processDay(3);
        assertEquals("Pending", shelter.getAnimals().get(0).getCurrentState().getStatus());
    }
}