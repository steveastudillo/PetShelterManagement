package org.example;

public class AdoptionCounselor extends Staff {

    public AdoptionCounselor(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public String getRole() {
        return "Adoption Counselor";
    }
}