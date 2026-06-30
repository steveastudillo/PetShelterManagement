package org.example;

public class App {

    public static void main(String[] args) {

        Animal buddy = AnimalFactory.createAnimal(
                AnimalType.DOG,
                1,
                "Buddy",
                3,
                "Healthy"
        );

        System.out.println(buddy);

        buddy.setCurrentState(new AvailableState());
        System.out.println(buddy);

        buddy.setCurrentState(new PendingState());
        System.out.println(buddy);

        buddy.setCurrentState(new AdoptedState());
        System.out.println(buddy);
    }
}