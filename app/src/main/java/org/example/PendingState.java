package org.example;

public class PendingState implements AnimalState {

    @Override
    public String getStatus() {
        return "Pending";
    }
}