package org.example;

public class Veterinarian extends Staff {

    public Veterinarian(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public String getRole() {
        return "Veterinarian";
    }
    
    public void examineAnimal(Animal animal) {
        System.out.println(getName() + " examined " + animal.getName() + ".");
        animal.setHealthStatus("Healthy");
        System.out.println(animal.getName() + " is now marked as Healthy.");
    }
}