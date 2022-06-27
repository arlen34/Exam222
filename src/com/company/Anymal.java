package com.company;

public abstract class Anymal {
    private String food;
    private String location;

    public Anymal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    abstract void makeNoise();
    abstract void eat();
    abstract void sleep();
}
