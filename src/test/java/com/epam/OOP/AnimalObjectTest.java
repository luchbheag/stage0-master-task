package com.epam.OOP;

public class AnimalObjectTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Animal animalWithFivePaws = new Animal("yellow", 5, true);
        Animal animalWithOnePaw = new Animal("purple", 1, false);

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
        System.out.println(animalWithFivePaws.getDescription());
        System.out.println(animalWithOnePaw.getDescription());
    }
}
