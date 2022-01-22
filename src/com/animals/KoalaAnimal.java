package com.animals;
import com.luxoft.Animals;

public class KoalaAnimal extends Animals {
    public KoalaAnimal(String name, String weight, String height) {
        super(name, weight, height);
        System.out.println("Koala says Hello");}

    @Override
    public void makeSound() {
        System.out.println("Koala says Grrrrrrrrrr");}

    @Override
    public void eat() {
        System.out.println("Koala is eating grass");}

    @Override
    public void sleep() {
        System.out.println("Koala is sleeping 12 hours");}
}
