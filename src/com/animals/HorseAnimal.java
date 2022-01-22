package com.animals;
import com.luxoft.Animals;

public class HorseAnimal extends Animals  {
    public HorseAnimal(String name, String weight, String height) {
        super(name, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says Pfffffff");}

    @Override
    public void eat() {
        System.out.println("Horse is eating grass");}

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping 8 hours");}
}
