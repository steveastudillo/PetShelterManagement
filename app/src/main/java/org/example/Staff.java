package org.example;

public abstract class Staff {

    private String name;
    private int capacity;

    public Staff(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return getRole() + " " + name +
                " (Capacity: " + capacity + ")";
    }
}