package org.example;

public class AvailableState implements AnimalState {

    @Override
    public String getStatus() {
        return "Available";
    }
}