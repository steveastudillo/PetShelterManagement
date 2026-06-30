package org.example;

public class AdoptionCounselor extends Staff {

    public AdoptionCounselor(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public String getRole() {
        return "Adoption Counselor";
    }
    public void approveAdoption(Animal animal) {
        System.out.println(getName() + " approved the adoption of " + animal.getName() + ".");
        animal.setCurrentState(new AdoptedState());
    }
}