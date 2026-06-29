package org.example;

public abstract class Animal {

    private int id;
    private String name;
    private int age;
    private String healthStatus;

    public Animal(int id, String name, int age, String healthStatus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.healthStatus = healthStatus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public abstract String getSpecies();

    @Override
    public String toString() {
        return getSpecies() +
                " [ID=" + id +
                ", Name=" + name +
                ", Age=" + age +
                ", Health=" + healthStatus + "]";
    }
}