package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VeterinarianTest {
  @Test
public void veterinarianMakesAnimalHealthy() {

    Veterinarian vet = new Veterinarian("Dr. Smith", 5);

    Animal dog = AnimalFactory.createAnimal(
            AnimalType.DOG,
            1,
            "Buddy",
            3,
            "Needs Checkup");

    vet.examineAnimal(dog);

    assertEquals("Healthy", dog.getHealthStatus());
}  
}
