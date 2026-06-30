package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private final List<Animal> animals;
    private final List<Adopter> adopters;
    private final List<Staff> staff;

    public Shelter() {
        animals = new ArrayList<>();
        staff = new ArrayList<>();
        adopters = new ArrayList<>();
    }
    public void initializeAdopters() {
        adopters.add(new Adopter("John", AnimalType.DOG));
        adopters.add(new Adopter("Alice", AnimalType.CAT));
    }
    public void initializeStaff() {
        staff.add(new Veterinarian("Dr. Smith", 5));
        staff.add(new AdoptionCounselor("Emma", 3));
    }

public void runSimulation() {
    System.out.println("-=-=-=- Pet Shelter Simulation -=-=-=-");
    initializeAnimals();
    initializeStaff();
    initializeAdopters();
    for (int day = 1; day <= 7; day++) {
        System.out.println("\n-=-=-=- DAY " + day + " -=-=-=-");
        processDay(day);
        printAnimals();
    }
}

public void processDay(int day) {
    if (day == 1) {
        System.out.println("All animals are now available for adoption.");
        for (Animal animal : animals) {
            animal.setCurrentState(new AvailableState());
        }

    } else if (day == 2) {
        System.out.println("A new stray dog arrived.");
        System.out.println(staff.get(0).getName() + " completed Rocky's intake examination.");
        animals.add(AnimalFactory.createAnimal(
                AnimalType.DOG,
                6,
                "Rocky",
                2,
                "Healthy"));

    } else if (day == 3) {
        Adopter adopter = adopters.get(0);
        System.out.println(adopter.getName() + " wants to adopt a " + adopter.getPreferredAnimal() + ".");
        System.out.println("Buddy matched with " + adopter.getName() + ".");
        System.out.println(staff.get(1).getName() + " is reviewing the application.");
        animals.get(0).setCurrentState(new PendingState());

    } else if (day == 4) {
        System.out.println("Buddy was adopted by " + adopters.get(0).getName() + ".");
        System.out.println(staff.get(1).getName() + " finalized Buddy's adoption.");
        animals.get(0).setCurrentState(new AdoptedState());
    } else {
        System.out.println("Routine shelter operations.");
    }
}


public void initializeAnimals() {
    animals.add(AnimalFactory.createAnimal(
            AnimalType.DOG,
            1,
            "Buddy",
            3,
            "Healthy"));

    animals.add(AnimalFactory.createAnimal(
            AnimalType.CAT,
            2,
            "Luna",
            2,
            "Healthy"));

    animals.add(AnimalFactory.createAnimal(
            AnimalType.RABBIT,
            3,
            "Coco",
            1,
            "Healthy"));

    animals.add(AnimalFactory.createAnimal(
            AnimalType.DOG,
            4,
            "Max",
            5,
            "Needs Checkup"));

    animals.add(AnimalFactory.createAnimal(
            AnimalType.CAT,
            5,
            "Milo",
            4,
            "Healthy"));
    }

public void printAnimals() {

    System.out.println("Current Shelter Animals");
    System.out.println("------------------------");

    for (Animal animal : animals) {
        System.out.println(animal);
    }
}

public List<Animal> getAnimals() {
    return animals;
    }
}