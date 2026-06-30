package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdopterTest {

    @Test
    public void adopterStoresInformation() {

        Adopter adopter = new Adopter("John", AnimalType.DOG);

        assertEquals("John", adopter.getName());
        assertEquals(AnimalType.DOG, adopter.getPreferredAnimal());
    }
}