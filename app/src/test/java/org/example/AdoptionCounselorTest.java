package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdoptionCounselorTest {
    @Test
public void counselorApprovesAdoption() {

    AdoptionCounselor counselor =
            new AdoptionCounselor("Emma", 3);

    Animal dog = AnimalFactory.createAnimal(
            AnimalType.DOG,
            1,
            "Buddy",
            3,
            "Healthy");

    counselor.approveAdoption(dog);

    assertEquals(
            "Adopted",
            dog.getCurrentState().getStatus());
}
}
