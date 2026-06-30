package org.example;

public class AdoptedState implements AnimalState {

    @Override
    public String getStatus() {
        return "Adopted";
    }
}