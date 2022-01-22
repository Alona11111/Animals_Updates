package com.animals;


public class CatAnimal extends Animals{
    public CatAnimal(String name, String weight, String height) {
        super(name, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is saying Myauuuuu");}

    @Override
    public void eat() {
        System.out.println("Cat is eating milk");}

    @Override
    public void sleep() {
        System.out.println("Cat if sleeping 8 hours");}

    public void setweight(String weight) {
        this.weight = weight;
    }
}

