package com.company;

public class Horse extends Anymal{
    private String horseName;

    public Horse(String food, String location, String horseName) {
        super(food, location);
        this.horseName = horseName;
    }

    @Override
    void makeNoise() {
        System.out.println(horseName+" making noise.");
    }

    @Override
    void eat() {
        System.out.println(" Eating apple");
    }

    @Override
    void sleep() {
        System.out.println(" No sleeping");
    }
}
