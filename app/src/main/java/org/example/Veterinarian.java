package org.example;

public class Veterinarian extends Staff {

    public Veterinarian(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public String getRole() {
        return "Veterinarian";
    }
}