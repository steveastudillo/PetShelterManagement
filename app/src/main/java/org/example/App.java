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

        Animal luna = AnimalFactory.createAnimal(
                AnimalType.CAT,
                2,
                "Luna",
                2,
                "Healthy"
        );

        Animal coco = AnimalFactory.createAnimal(
                AnimalType.RABBIT,
                3,
                "Coco",
                1,
                "Healthy"
        );

        System.out.println(buddy);
        System.out.println(luna);
        System.out.println(coco);
    }
}