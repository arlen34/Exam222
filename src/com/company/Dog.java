package com.company;

public class Dog extends  Anymal{
    private String dogName;

    public Dog(String food, String location, String dogName) {
        super(food, location);
        this.dogName = dogName;
    }

    @Override
    void makeNoise() {
        System.out.println(dogName+" making noise.");
    }

    @Override
    void eat() {
        System.out.println(" Eating brad");
    }

    @Override
    void sleep() {
        System.out.println(" Sleeping on the out");
    }
}
