package com.company;

public class Cat extends Anymal{
    public Cat(String food, String location, String catName) {
        super(food, location);
        this.catName = catName;
    }

    private String catName;

    @Override
    void makeNoise() {
        System.out.println(catName+" making noise.");
    }

    @Override
    void eat() {
        System.out.println(" eating fich");
    }

    @Override
    void sleep() {
        System.out.println(" Sleeping at home");
    }
}
