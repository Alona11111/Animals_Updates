package com.animals;

public abstract class Animals {
    String name;
    String weight;
    String height;

    public Animals (String name, String weight, String height) {
     //   System.out.println("animals constructor");
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();

    public String getName() {return name;}
    public String getWeight() {return weight;}
    public String getHeight() {return height;}
}